package com.kdev.pattern.creational.abstactfactory;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
