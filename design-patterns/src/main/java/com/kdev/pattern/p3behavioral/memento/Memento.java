package com.kdev.pattern.p3behavioral.memento;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
