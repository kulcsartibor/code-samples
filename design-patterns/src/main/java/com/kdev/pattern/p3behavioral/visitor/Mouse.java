package com.kdev.pattern.p3behavioral.visitor;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
