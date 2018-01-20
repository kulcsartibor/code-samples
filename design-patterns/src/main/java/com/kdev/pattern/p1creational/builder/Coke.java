package com.kdev.pattern.p1creational.builder;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
