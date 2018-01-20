package com.kdev.pattern.p3behavioral.strategy;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
