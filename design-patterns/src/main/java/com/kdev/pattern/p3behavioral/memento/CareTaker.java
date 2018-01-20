package com.kdev.pattern.p3behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
