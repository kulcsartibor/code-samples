package com.kdev.pattern.p3behavioral.visitor;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
