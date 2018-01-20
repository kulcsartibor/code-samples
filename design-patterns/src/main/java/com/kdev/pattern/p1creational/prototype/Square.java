package com.kdev.pattern.p1creational.prototype;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
