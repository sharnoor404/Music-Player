package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button play,pause,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=(Button)findViewById(R.id.btn_play);
        pause=(Button)findViewById(R.id.btn_pause);
        stop=(Button)findViewById(R.id.btn_stop);

    }

    @Override
    public void onClick(View v) {
        
    }
    //step 1:change action bar color by changin the primary colors in color.xml
    //step 2:to add circular image add dependencies in app gradle
    //step 3: Add layout




}
