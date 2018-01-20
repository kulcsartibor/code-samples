package com.kdev.pattern.p1creational.builder;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}