package com.kdev.pattern.behavioral.visitor;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
