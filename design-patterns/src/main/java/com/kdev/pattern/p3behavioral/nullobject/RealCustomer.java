package com.kdev.pattern.p3behavioral.nullobject;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
