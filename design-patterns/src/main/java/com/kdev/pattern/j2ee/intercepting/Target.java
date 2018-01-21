package com.kdev.pattern.j2ee.intercepting;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
