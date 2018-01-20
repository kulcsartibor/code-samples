package com.kdev.pattern.p3behavioral.nullobject;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}