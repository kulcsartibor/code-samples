package com.kdev.pattern.behavioral.visitor;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
