package com.kdev.pattern.j2ee.compositentity;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {

        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
