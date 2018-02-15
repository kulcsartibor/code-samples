package com.kdev.samples.ctask.ticluster;

import com.hazelcast.core.ManagedContext;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/15/2018
 * @since
 */
@Slf4j
public class ClusterManagedContext implements ManagedContext
{
    private final LocalResource localResource;

    public ClusterManagedContext(LocalResource localResource){
        this.localResource = localResource;
    }

    @Override
    public Object initialize(Object obj)
    {
        if(obj instanceof ClusteredTask){
            log.info("Initializing object instance.");
            ((ClusteredTask) obj).setLocalResource(localResource);
        }

        return obj;
    }
}
