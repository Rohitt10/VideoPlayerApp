package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    VideoView videoView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView=findViewById(R.id.videoView);
        videoView2=findViewById(R.id.videoView2);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.messi);

        MediaController mc=new MediaController(this);
        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);

        //playing from url
        Uri uri=Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4");
        videoView2.setVideoURI(uri);
        MediaController mc2=new MediaController(this);
        mc2.setAnchorView(videoView2);
        videoView2.setMediaController(mc2);
        videoView2.start();
    }
}