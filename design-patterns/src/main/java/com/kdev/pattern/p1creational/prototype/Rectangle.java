package com.kdev.pattern.p1creational.prototype;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
