package com.kdev.pattern.behavioral.chainofresp;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
