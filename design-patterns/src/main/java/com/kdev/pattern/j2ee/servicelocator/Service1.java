package com.kdev.pattern.j2ee.servicelocator;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
