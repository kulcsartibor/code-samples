package com.kdev.pattern.p2sctructural.bridge;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
