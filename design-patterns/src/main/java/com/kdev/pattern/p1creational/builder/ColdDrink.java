package com.kdev.pattern.p1creational.builder;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
