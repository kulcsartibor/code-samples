package com.kdev.pattern.p3behavioral.observer;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
