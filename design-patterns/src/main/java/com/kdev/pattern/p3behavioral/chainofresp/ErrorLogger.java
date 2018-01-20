package com.kdev.pattern.p3behavioral.chainofresp;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
