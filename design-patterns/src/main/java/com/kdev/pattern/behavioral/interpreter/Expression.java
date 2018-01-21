package com.kdev.pattern.behavioral.interpreter;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public interface Expression {
    public boolean interpret(String context);
}
