package com.kdev.pattern.creational.builder;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
