package com.kdev.samples.ctask.ticluster.single;

import com.kdev.samples.ctask.ticluster.ClusteredTask;
import com.kdev.samples.ctask.ticluster.LocalResource;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/15/2018
 * @since
 */
@Slf4j
public class SimpleClusteredTask implements ClusteredTask, Runnable, Serializable
{
    private transient LocalResource localResource;

    private final UUID id = UUID.randomUUID();

    @Override
    public void setLocalResource(LocalResource localResource)
    {
        this.localResource = localResource;
    }

    @Override
    public void run()
    {
        log.info("Execute simple task, id: {}, thread:[{}]", id, Thread.currentThread().getName());

        localResource.execute();

    }
}
