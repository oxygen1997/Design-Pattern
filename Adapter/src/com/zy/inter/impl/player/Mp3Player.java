package com.zy.inter.impl.player;

import com.zy.inter.AdvanceMediaPlayer;

public class Mp3Player implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp3(String fileName) {
        System.out.println("play mp3 file : "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }

}
