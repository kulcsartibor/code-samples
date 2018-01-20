package com.kdev.pattern.p4j2ee.intercepting;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
