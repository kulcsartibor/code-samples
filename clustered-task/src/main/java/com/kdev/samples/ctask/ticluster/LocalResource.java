package com.kdev.samples.ctask.ticluster;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/15/2018
 * @since
 */
@Slf4j
public class LocalResource
{
    private static final UUID instanceId = UUID.randomUUID();

    public LocalResource(){
        log.info("Creating local resource. UUID:[{}]", instanceId);
    }

    public void execute(){
        log.info("Executing local resource. UUID:[{}]", instanceId);
    }

}
