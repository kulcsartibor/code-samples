package com.kdev.pattern.p1creational.abstactfactory;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
