package com.kdev.pattern.p4j2ee.delegate;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
