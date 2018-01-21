package com.kdev.pattern.sctructural.froncontroller;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}