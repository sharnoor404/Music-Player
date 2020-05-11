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
    int pauseCurrentPosition;

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
        //step 1:change action bar color by changin the primary colors in color.xml
        //step 2:to add circular image add dependencies in app gradle
        //step 3: Add layout
        switch(v.getId()){
            case R.id.btn_play:
                if(mediaPlayer==null){//i.e if no music is playing
                    mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.music);
                    mediaPlayer.start();
                }
                else if(!mediaPlayer.isPlaying()){//to be implemented when paused
                    mediaPlayer.seekTo(pauseCurrentPosition);
                    //continues music from the paused position
                    mediaPlayer.start();
                }


                break;
            case R.id.btn_pause:
                if(mediaPlayer!=null){//i.e if music is playing
                    pauseCurrentPosition=mediaPlayer.getCurrentPosition();//it retrieves the position at which pause was pressed for the music

                }
                break;
            case R.id.btn_stop:
                if(mediaPlayer!=null)
                {//without this condition, the media player may crash if we click on the pause button after the music is already paused
                    mediaPlayer.stop();
                    break;
                }


        }
    }





}
