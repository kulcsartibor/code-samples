package com.kdev.pattern.p3behavioral.templatemethod;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
