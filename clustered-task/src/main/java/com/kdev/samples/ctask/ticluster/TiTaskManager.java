package com.kdev.samples.ctask.ticluster;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.scheduledexecutor.IScheduledExecutorService;
import com.kdev.samples.ctask.ticluster.single.SimpleClusteredTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/15/2018
 * @since
 */
public class TiTaskManager
{
    private final HazelcastInstance hazelcastInstance;

    private List<SimpleClusteredTask> tasks = new ArrayList<>();
    IScheduledExecutorService scheduledExecSvc;


    public TiTaskManager(HazelcastInstance hazelcastInstance){
        this.hazelcastInstance = hazelcastInstance;
        scheduledExecSvc = this.hazelcastInstance.getScheduledExecutorService("scheduledExecSvc");

    }

    public void registerTask(SimpleClusteredTask task){
        tasks.add(task);

        scheduledExecSvc.scheduleAtFixedRate(task, 0, 3, TimeUnit.SECONDS);
//        scheduledExecSvc.scheduleOnAllMembersAtFixedRate(task, 0, 3, TimeUnit.SECONDS);
    }
}
