package com.kdev.pattern.p2sctructural.decorator;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}