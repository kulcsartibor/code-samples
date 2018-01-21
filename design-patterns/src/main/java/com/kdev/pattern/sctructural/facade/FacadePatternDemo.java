package com.kdev.pattern.sctructural.facade;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
