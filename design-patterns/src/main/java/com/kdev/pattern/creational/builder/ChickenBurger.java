package com.kdev.pattern.creational.builder;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}