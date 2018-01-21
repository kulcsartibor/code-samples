package com.kdev.pattern.creational.abstactfactory;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
