package com.kdev.samples.ctask.lecluster.task;

/**
 * @author trovo.st@gmail.com
 * 2018-02-14
 */
public abstract class DistributedTask {

    private final ExecutionPolicy executionPolicy;

    protected DistributedTask(ExecutionPolicy executionPolicy){
        this.executionPolicy = executionPolicy;
    }

    public abstract String getTaskId();
}
