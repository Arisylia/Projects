package com.example.pinapple.eartraining;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import static com.example.pinapple.eartraining.Loaders.soundPool;

public class Intervals extends AppCompatActivity {
    Random random = new Random();
    Handler handler = new Handler();
    private boolean firstTry;
    private int note1;
    private int note2;
    private int answer;
    private View answerButton;
    static Button unison, min2, maj2, min3, maj3, p4, tritone, p5, min6, maj6, min7, maj7, octave, min9, maj9, min10, maj10;
    static Button[] buttonList = {unison, min2, maj2, min3, maj3, p4, tritone, p5, min6, maj6, min7, maj7, octave, min9, maj9, min10, maj10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intervals);
        Loaders.loadIntervalButtons();
        createQuestion();


    }

    private void chooseInterval(){
        note1 = random.nextInt(MainActivity.soundArray.length);
        note2 = note1 + random.nextInt(15 + 1 + 15) - 15;
    }
    private void playInterval(){

        soundPool.play(MainActivity.soundArray[note1],1,1,1,0,1);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                soundPool.play(MainActivity.soundArray[note2],1,1,1,0,1);
            }
        }, 800);

    }
    private void createQuestion(){
        chooseInterval();
        answer = Math.abs(note1-note2);
        answerButton = buttonList[answer-1];
        playInterval();
    }

    public void buttonListener(View view){
        if(view == answerButton){
            update();
            createQuestion();
        }
        else{
            firstTry = false;
            view.setBackgroundColor(0xff3232);
        }
    }
    private void update(){
        for(int i = 0; i < buttonList.length; i++){
            buttonList[i].setBackgroundColor(android.R.drawable.btn_default);
        }
        firstTry = true;
    }
}
