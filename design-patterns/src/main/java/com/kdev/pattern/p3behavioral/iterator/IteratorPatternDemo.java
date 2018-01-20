package com.kdev.pattern.p3behavioral.iterator;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
