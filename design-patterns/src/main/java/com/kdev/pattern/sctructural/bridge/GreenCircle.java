package com.kdev.pattern.sctructural.bridge;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}