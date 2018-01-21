package com.kdev.pattern.behavioral.mediator;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
