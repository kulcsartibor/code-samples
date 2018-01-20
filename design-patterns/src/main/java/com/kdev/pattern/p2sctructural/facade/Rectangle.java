package com.kdev.pattern.p2sctructural.facade;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
