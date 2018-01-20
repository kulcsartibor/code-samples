package com.kdev.pattern.p4j2ee.intercepting;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
