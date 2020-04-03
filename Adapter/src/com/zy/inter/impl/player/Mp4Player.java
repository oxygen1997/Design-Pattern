package com.zy.inter.impl.player;

import com.zy.inter.AdvanceMediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp3(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4 file : "+fileName);
    }

}
