package com.kdev.samples.ctask.sharedset;

import com.hazelcast.config.CollectionConfig;
import com.hazelcast.config.Config;
import com.hazelcast.config.RingbufferConfig;
import com.hazelcast.config.SetConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.ringbuffer.impl.Ringbuffer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 2/27/2018
 * @since
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class SetOverloadTest
{

    @Test
    public void testHazelcastSetOverload(){
        SetConfig collectionSet = new SetConfig();
        collectionSet.setMaxSize(5).setName("MySet");

        Config config = new Config();
        config.addSetConfig(collectionSet);
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(config);


        Set<Integer> set = hazelcastInstance.getSet( "MySet" );

        int i = 20;

        while(i-- > 0){
            set.add(i);
            System.out.println("Set size: " + set.size() + "   adding new: " + i );
        }

        System.out.println();
        System.out.println();
        System.out.println();

        AtomicInteger n = new AtomicInteger(0);

        set.forEach(e -> System.out.println("Element: " + n.incrementAndGet() + " :: "  + e));


    }
}