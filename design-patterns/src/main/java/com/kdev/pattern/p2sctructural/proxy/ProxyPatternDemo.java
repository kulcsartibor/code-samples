package com.kdev.pattern.p2sctructural.proxy;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
