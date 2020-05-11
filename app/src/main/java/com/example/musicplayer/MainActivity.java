package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button play,pause,stop;
    MediaPlayer mediaPlayer;
    //to operate the media(music) here.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=(Button)findViewById(R.id.btn_play);
        pause=(Button)findViewById(R.id.btn_pause);
        stop=(Button)findViewById(R.id.btn_stop);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_play:
                mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.music);
                mediaPlayer.start();

                break;
            case R.id.btn_pause:
                break;
            case R.id.btn_stop:
                break;

        }
    }
    //step 1:change action bar color by changin the primary colors in color.xml
    //step 2:to add circular image add dependencies in app gradle
    //step 3: Add layout




}
