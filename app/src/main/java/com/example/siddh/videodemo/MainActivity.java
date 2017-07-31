package com.example.siddh.videodemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String path = "android.resource://" + getPackageName() + "/" + R.raw.demovideo;
        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse(path));

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
