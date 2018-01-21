package com.kdev.pattern.j2ee.servicelocator;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class InitialContext {
    public Object lookup(String jndiName){

        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }
        else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
