package com.example.pinapple.eartraining;

import android.content.Intent;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SoundPool soundPool = new SoundPool(1,1,1);
    static int  a2 , bb2 , b2 , c2 , db2 , d2 , eb2 , e2 , f2 , gb2 , g2 , ab2 ,
             a3 , bb3 , b3 , c3 , db3 , d3 , eb3 , e3 , f3 , gb3 , g3 , ab3 , 
             a4 , bb4 , b4 , c4 , db4 , d4 , eb4 , e4 , f4 , gb4 , g4 , ab4 , 
             a5 , bb5 , b5 , c5 , db5 , d5 , eb5 , e5 , f5 , gb5 , g5 , ab5 , 
             a6 , bb6 , b6 , c6 , db6 , d6 , eb6 , e6 , f6 , gb6 , g6 , ab6;
    static int[] soundArray = {a2 , bb2 , b2 , c2 , db2 , d2 , eb2 , e2 , f2 , gb2 , g2 , ab2 ,
            a3 , bb3 , b3 , c3 , db3 , d3 , eb3 , e3 , f3 , gb3 , g3 , ab3 ,
            a4 , bb4 , b4 , c4 , db4 , d4 , eb4 , e4 , f4 , gb4 , g4 , ab4 ,
            a5 , bb5 , b5 , c5 , db5 , d5 , eb5 , e5 , f5 , gb5 , g5 , ab5 ,
            a6 , bb6 , b6 , c6 , db6 , d6 , eb6 , e6 , f6 , gb6 , g6 , ab6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Loaders.loadSounds(this);



    }

    public void launchIntervals(View view){
        Intent intent = new Intent(this, Intervals.class);
        startActivity(intent);
    }
}
