package com.kdev.pattern.behavioral.chainofresp;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}