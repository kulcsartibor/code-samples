package com.kdev.pattern.p3behavioral.command;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
