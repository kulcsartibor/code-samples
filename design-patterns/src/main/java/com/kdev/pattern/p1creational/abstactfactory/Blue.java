package com.kdev.pattern.p1creational.abstactfactory;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
