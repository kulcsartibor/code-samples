package com.kdev.samples.ctask.config;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.kdev.samples.ctask.lecluster.ClusteredTaskManager;
import com.kdev.samples.ctask.lecluster.single.SimpleTask;
import com.kdev.samples.ctask.ticluster.ClusterManagedContext;
import com.kdev.samples.ctask.ticluster.LocalResource;
import com.kdev.samples.ctask.ticluster.TiTaskManager;
import com.kdev.samples.ctask.ticluster.single.SimpleClusteredTask;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author trovo.st@gmail.com
 * 2018-02-14
 */
@Configuration
public class ApplicationConfig {

//    @Bean(name = "clusteringHazelcastInstance")
//    public HazelcastInstance getHazelcastInstance(){
//        return Hazelcast.newHazelcastInstance();
//    }

    @Bean(name = "clusteringHazelcastInstance")
    public HazelcastInstance getHazelcastInstance(LocalResource localResource){
        Config config = new Config();
        config.getScheduledExecutorConfig("distributedScheduledExecutor")
                .setPoolSize(1)
                .setCapacity(2)
                .setDurability(1);

        config.setManagedContext(new ClusterManagedContext(localResource));

        return Hazelcast.newHazelcastInstance(config);
    }

//    @Bean(name="clusteredTaskManager")
    public ClusteredTaskManager getTaskManager(@Qualifier("clusteringHazelcastInstance") HazelcastInstance hazelcastInstance){
        ClusteredTaskManager manager = new ClusteredTaskManager(hazelcastInstance);
        return manager;
    }

//    @Bean
//    @Autowired
    public SimpleTask getSimpleTask(ClusteredTaskManager taskManager){
        SimpleTask simpleTask = new SimpleTask();

        taskManager.registerSingleNodeTask(simpleTask);
        return simpleTask;
    }

    @Bean
    public LocalResource getLocalResource(){
        return new LocalResource();
    }

    @Bean
    public SimpleClusteredTask getClusteredTask(LocalResource localResource){
        SimpleClusteredTask task = new SimpleClusteredTask();
        task.setLocalResource(localResource);
        return task;
    }

    @Bean
    public TiTaskManager getTaskManager(@Qualifier("clusteringHazelcastInstance") HazelcastInstance hazelcastInstance,
            SimpleClusteredTask simpleClusterdTask){
        TiTaskManager manager = new TiTaskManager(hazelcastInstance);
        manager.registerTask(simpleClusterdTask);
        return manager;
    }







}
