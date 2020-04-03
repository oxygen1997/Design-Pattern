package com.zy.inter.impl.audio;

import com.zy.inter.MediaPlayer;
import com.zy.inter.impl.adapter.MediaAdapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play("mp3",fileName);
        }else if ("vlc".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play("vlc",fileName);
        }else if ("mp4".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play("mp4",fileName);
        }else{
            System.out.println("Invalid media [ "+fileName+" ] format not supported");
        }
    }
}
