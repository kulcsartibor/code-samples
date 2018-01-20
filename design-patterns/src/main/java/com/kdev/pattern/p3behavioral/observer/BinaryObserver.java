package com.kdev.pattern.p3behavioral.observer;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
