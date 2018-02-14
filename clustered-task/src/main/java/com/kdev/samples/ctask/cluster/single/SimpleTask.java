package com.kdev.samples.ctask.cluster.single;

import com.kdev.samples.ctask.cluster.task.SingleNodeTask;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author trovo.st@gmail.com
 * 2018-02-14
 */
@Slf4j
public class SimpleTask extends SingleNodeTask {

    private static final String TASK_NAME = "SIMPLE TASK";

    private AtomicBoolean enabled = new AtomicBoolean(false);

    ScheduledExecutorService scheduledExecutorService =
            Executors.newScheduledThreadPool(1);

    public SimpleTask() {
        log.info("Creating Simple Task");
    }

    @Override
    public void enable() {
        this.enabled.set(true);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (!enabled.get()) {
                    log.info("Executor should be shut down, thread={} :: {}",
                            Thread.currentThread().getName(),
                            Thread.currentThread().hashCode()
                            );
                    scheduledExecutorService.shutdown();
                }
                log.info("Executed on thread={} :: {}",
                        Thread.currentThread().getName(),
                        Thread.currentThread().hashCode()
                        );
            }
        }, 0, 5, TimeUnit.SECONDS);
    }

    @Override
    public String getTaskId() {
        return TASK_NAME;
    }

    @Override
    public void interrupt() {
        this.enabled.set(false);
    }
}
