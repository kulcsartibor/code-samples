package com.kdev.pattern.p1creational.abstactfactory;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}
