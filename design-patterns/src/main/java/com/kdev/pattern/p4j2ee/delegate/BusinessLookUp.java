package com.kdev.pattern.p4j2ee.delegate;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){

        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }
        else {
            return new JMSService();
        }
    }
}
