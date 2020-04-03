package com.zy.inter.impl.player;

import com.zy.inter.AdvanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("play vlc file : "+fileName);
    }

    @Override
    public void playMp3(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {

    }

}
