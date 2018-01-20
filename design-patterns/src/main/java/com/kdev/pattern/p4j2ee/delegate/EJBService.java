package com.kdev.pattern.p4j2ee.delegate;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}