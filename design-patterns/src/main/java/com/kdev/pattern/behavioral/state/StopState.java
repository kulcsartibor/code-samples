package com.kdev.pattern.behavioral.state;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
