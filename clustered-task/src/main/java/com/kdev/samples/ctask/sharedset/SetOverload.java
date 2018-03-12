package com.kdev.samples.ctask.sharedset;

import com.hazelcast.core.HazelcastInstance;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/27/2018
 * @since
 */
public class SetOverload
{
    HazelcastInstance hazelcastInstance;

    public SetOverload(HazelcastInstance hazelcastInstance){
        this.hazelcastInstance = hazelcastInstance;
    }
}
