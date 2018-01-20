package com.kdev.pattern.p3behavioral.interpreter;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {

        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
