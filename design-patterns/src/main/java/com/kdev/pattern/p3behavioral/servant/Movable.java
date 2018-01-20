package com.kdev.pattern.p3behavioral.servant;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
// Interface specifying what serviced classes needs to implement, to be
// serviced by servant.
public interface Movable {
    public void setPosition(Position p);

    public Position getPosition();
}
