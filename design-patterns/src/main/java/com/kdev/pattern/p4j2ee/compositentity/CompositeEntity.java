package com.kdev.pattern.p4j2ee.compositentity;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
