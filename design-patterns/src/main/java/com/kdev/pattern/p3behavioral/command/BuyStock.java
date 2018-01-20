package com.kdev.pattern.p3behavioral.command;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
