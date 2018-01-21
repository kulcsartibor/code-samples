package com.kdev.pattern.behavioral.observer;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}