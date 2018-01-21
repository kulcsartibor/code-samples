package com.kdev.pattern.sctructural.adapter;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}