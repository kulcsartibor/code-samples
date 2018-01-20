package com.kdev.pattern.p2sctructural.bridge;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
