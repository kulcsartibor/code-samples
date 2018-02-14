package com.kdev.samples.ctask.cluster.task;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author trovo.st@gmail.com
 * 2018-02-14
 */
public abstract class SingleNodeTask extends DistributedTask implements Interruptable{

    private AtomicBoolean leader = new AtomicBoolean(false);

    public SingleNodeTask(){
        super(ExecutionPolicy.SINGLE_NODE);
    }

    public boolean isLeader(){
        return this.leader.get();
    }

    public abstract void enable();
}
