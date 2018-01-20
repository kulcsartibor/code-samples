package com.kdev.pattern.p3behavioral.state;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
