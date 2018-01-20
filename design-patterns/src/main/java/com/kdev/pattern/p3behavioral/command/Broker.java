package com.kdev.pattern.p3behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
