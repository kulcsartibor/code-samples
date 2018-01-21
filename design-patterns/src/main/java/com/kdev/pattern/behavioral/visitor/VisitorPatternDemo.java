package com.kdev.pattern.behavioral.visitor;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
