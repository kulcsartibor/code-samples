package com.kdev.pattern.p2sctructural.proxy;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
