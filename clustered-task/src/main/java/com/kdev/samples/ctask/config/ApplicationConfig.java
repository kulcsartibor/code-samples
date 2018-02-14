package com.kdev.samples.ctask.config;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.kdev.samples.ctask.cluster.ClusteredTaskManager;
import com.kdev.samples.ctask.cluster.single.SimpleTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author trovo.st@gmail.com
 * 2018-02-14
 */
@Configuration
public class ApplicationConfig {

    @Bean(name = "clusteringHazelcastInstance")
    public HazelcastInstance getHazelcastInstance(){
        return Hazelcast.newHazelcastInstance();
    }

    @Bean(name="clusteredTaskManager")
    public ClusteredTaskManager getTaskManager(@Qualifier("clusteringHazelcastInstance") HazelcastInstance hazelcastInstance){
        ClusteredTaskManager manager = new ClusteredTaskManager(hazelcastInstance);
        return manager;
    }

    @Bean
    @Autowired
    public SimpleTask getSimpleTask(ClusteredTaskManager taskManager){
        SimpleTask simpleTask = new SimpleTask();

        taskManager.registerSingleNodeTask(simpleTask);
        return simpleTask;
    }
}
