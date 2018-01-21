package com.kdev.pattern.sctructural.adapter;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
