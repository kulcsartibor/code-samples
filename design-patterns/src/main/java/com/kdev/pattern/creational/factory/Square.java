package com.kdev.pattern.creational.factory;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
