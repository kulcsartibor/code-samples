package com.kdev.samples.ctask.lecluster;

import com.hazelcast.core.*;
import com.kdev.samples.ctask.lecluster.task.SingleNodeTask;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @author trovo.st@gmail.com
 * 2018-02-14
 */
@Slf4j
public class ClusteredTaskManager implements LifecycleListener, InitialMembershipListener{

    private final HazelcastInstance hazelcastInstance;

    Map<SingleNodeTask, ILock> singleNodeTasks = new HashMap<>();


    public ClusteredTaskManager(HazelcastInstance hazelcastInstance){
        log.info("Creating Task manager");
        this.hazelcastInstance = hazelcastInstance;
        this.hazelcastInstance.getLifecycleService().addLifecycleListener(this);
        this.hazelcastInstance.getCluster().addMembershipListener(this);
    }


    public void registerSingleNodeTask(SingleNodeTask task){
        ILock lock = this.hazelcastInstance.getLock(task.getTaskId());

        acquireLeadership(task, lock);

        this.singleNodeTasks.put(task,lock);
    }

    private void acquireLeadership(SingleNodeTask task, ILock lock){
        if(!task.isLeader())
        {
            log.info("Acquiring leadership: [task={}]", task.getTaskId());

            if(lock.tryLock())
            {
                log.info("Acquired the master lock: [task={}]", task.getTaskId());
                task.enable();
            }
            else
            {
                log.info("Master lock already acquired by another instance: [task={}]", task.getTaskId());
            }
        }
    }

    private void releaseLeadership(SingleNodeTask task, ILock lock){
        if(task.isLeader())
        {
            log.info("Releasing leadership: [task={}]", task.getTaskId());

            if(lock.isLockedByCurrentThread())
            {
                lock.unlock();
            }

            task.interrupt();

            log.debug("Released the master lock: [task={}]", task.getTaskId());
        }
        else
        {
            log.info("Not releasing as another instance is the owner of the lock: [task={}]", task.getTaskId());
        }
    }



    @Override
    public void init(InitialMembershipEvent event) {
        log.trace("Received initial membership event [event={}]", event);
    }

    @Override
    public void stateChanged(LifecycleEvent event) {
        log.trace("Triggered lifecycle event [event={}]", event);

        final LifecycleEvent.LifecycleState state = event.getState();

        switch(state)
        {
            case SHUTTING_DOWN:
                this.singleNodeTasks.forEach(this::releaseLeadership);
                break;
            default:
                break;
        }
    }

    @Override
    public void memberAdded(MembershipEvent event) {
        log.info("Received membership event [event={}]", event);
    }

    @Override
    public void memberRemoved(MembershipEvent event) {
        log.info("Received membership event [event={}]", event);
        this.singleNodeTasks.forEach(this::acquireLeadership);
    }

    @Override
    public void memberAttributeChanged(MemberAttributeEvent event) {
        log.info("Received membership event [event={}]", event);
    }
}
