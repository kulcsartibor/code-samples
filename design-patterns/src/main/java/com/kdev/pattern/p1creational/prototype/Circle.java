package com.kdev.pattern.p1creational.prototype;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
