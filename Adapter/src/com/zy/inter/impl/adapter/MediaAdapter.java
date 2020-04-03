package com.zy.inter.impl.adapter;

import com.zy.inter.AdvanceMediaPlayer;
import com.zy.inter.MediaPlayer;
import com.zy.inter.impl.player.Mp3Player;
import com.zy.inter.impl.player.Mp4Player;
import com.zy.inter.impl.player.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType){
        if ("mp3".equalsIgnoreCase(audioType)){
            advanceMediaPlayer = new Mp3Player();
        }else if ("vlc".equalsIgnoreCase(audioType)){
            advanceMediaPlayer = new VlcPlayer();
        }else if ("mp4".equalsIgnoreCase(audioType)){
            advanceMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)){
            advanceMediaPlayer.playMp3(fileName);
        }else if ("vlc".equalsIgnoreCase(audioType)){
            advanceMediaPlayer.playVlc(fileName);
        }else if ("mp4".equalsIgnoreCase(audioType)){
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}
