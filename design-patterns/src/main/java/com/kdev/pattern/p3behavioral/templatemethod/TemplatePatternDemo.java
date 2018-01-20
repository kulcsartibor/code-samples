package com.kdev.pattern.p3behavioral.templatemethod;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
