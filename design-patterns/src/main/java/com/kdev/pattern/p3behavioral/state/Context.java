package com.kdev.pattern.p3behavioral.state;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
