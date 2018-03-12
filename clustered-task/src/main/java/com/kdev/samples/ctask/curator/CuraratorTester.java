package com.kdev.samples.ctask.curator;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.x.async.AsyncCuratorFramework;

/**
 * @author Tibor Kulcsar
 * <p>
 * Date: 3/10/2018
 * @since
 */
public class CuraratorTester
{
    AsyncCuratorFramework async;
    CuratorFramework framework;

    public CuraratorTester()
    {
    }

    private void init()
    {
        framework = CuratorFrameworkFactory.builder()
                .connectString("")
                .build();

        async = AsyncCuratorFramework.wrap(framework);
    }


    private void asyncTest()
    {
        
    }
}
