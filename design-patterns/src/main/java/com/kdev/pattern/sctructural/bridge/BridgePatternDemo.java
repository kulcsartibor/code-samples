package com.kdev.pattern.sctructural.bridge;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
