package com.kdev.pattern.behavioral.servant;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */

// One of geometric classes
public class Rectangle implements Movable {
    // Position of the geometric object on some canvas
    private Position p;

    // Method, which sets position of geometric object
    public void setPosition(Position p) {
        this.p = p;
    }

    // Method, which returns position of geometric object
    public Position getPosition() {
        return this.p;
    }
}
