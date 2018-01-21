package com.kdev.pattern.j2ee.servicelocator;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}