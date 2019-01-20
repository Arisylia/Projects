package com.example.pinapple.japanesepractice;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TabHost;
import android.support.v7.app.ActionBar;
import java.lang.reflect.Array;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    Random random = new Random();

    static Switch aHiraganaSwitch, kHiraganaSwitch, sHiraganaSwitch, tHiraganaSwitch, nHiraganaSwitch, hHiraganaSwitch,
            mHiraganaSwitch, yHiraganaSwitch, rHiraganaSwitch, wHiraganaSwitch, just_nHiraganaSwitch, gHiraganaSwitch,
            zHiraganaSwitch, dHiraganaSwitch, bHiraganaSwitch, pHiraganaSwitch, aKatakanaSwitch, kKatakanaSwitch, sKatakanaSwitch, tKatakanaSwitch, nKatakanaSwitch, hKatakanaSwitch,
            mKatakanaSwitch, yKatakanaSwitch, rKatakanaSwitch, wKatakanaSwitch, just_nKatakanaSwitch, gKatakanaSwitch,
            zKatakanaSwitch, dKatakanaSwitch, bKatakanaSwitch, pKatakanaSwitch;

    static Switch[] testKanaFam = new Switch[32];/*
    String[] kanaFamName = {"aHiragana", "kHiragana", "sHiragana", "tHiragana", "nHiragana", "hHiraganaSwitch",
            "mHiragana", "yHiragana", "rHiragana", "wHiragana", "just_nHiragana", "gHiraganaSwitch",
            "zHiragana", "dHiragana", "bHiragana", "pHiragana", "aKatakana", "kKatakana", "sKatakana", "tKatakana", "nKatakana", "hKatakanaSwitch",
            "mKatakana", "yKatakana", "rKatakana", "wKatakana", "just_nKatakana", "gKatakanaSwitch",
            "zKatakana", "dKatakana", "bKatakana", "pKatakanaSwitch"};
            */
    static Switch[] kanaFamily =  new Switch[]{aHiraganaSwitch, kHiraganaSwitch, sHiraganaSwitch, tHiraganaSwitch, nHiraganaSwitch, hHiraganaSwitch,
            mHiraganaSwitch, yHiraganaSwitch, rHiraganaSwitch, wHiraganaSwitch, just_nHiraganaSwitch, gHiraganaSwitch,
            zHiraganaSwitch, dHiraganaSwitch, bHiraganaSwitch, pHiraganaSwitch, aKatakanaSwitch, kKatakanaSwitch, sKatakanaSwitch, tKatakanaSwitch, nKatakanaSwitch, hKatakanaSwitch,
            mKatakanaSwitch, yKatakanaSwitch, rKatakanaSwitch, wKatakanaSwitch, just_nKatakanaSwitch, gKatakanaSwitch,
            zKatakanaSwitch, dKatakanaSwitch, bKatakanaSwitch, pKatakanaSwitch};
    private static final int[] idArray = {R.id.aHiragana, R.id.kHiragana, R.id.sHiragana, R.id.tHiragana, R.id.nHiragana, R.id.hHiragana,
            R.id.mHiragana, R.id.yHiragana, R.id.rHiragana, R.id.wHiragana, R.id.just_nHiragana, R.id.gHiragana,
            R.id.zHiragana, R.id.dHiragana, R.id.bHiragana, R.id.pHiragana, R.id.aKatakana, R.id.kKatakana, R.id.sKatakana, R.id.tKatakana, R.id.nKatakana, R.id.hKatakana,
            R.id.mKatakana, R.id.yKatakana, R.id.rKatakana, R.id.wKatakana, R.id.just_nKatakana, R.id.gKatakana,
            R.id.zKatakana, R.id.dKatakana, R.id.bKatakana, R.id.pKatakana};


    
    boolean start = false;

    //TabHost tabHost;  is this even needed
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 32; i++){
            testKanaFam[i] = findViewById(idArray[i]);
        }

        /*
        aHiraganaSwitch = (Switch)findViewById(R.id.aHiragana);
        kHiraganaSwitch = (Switch)findViewById(R.id.kHiragana);
        sHiraganaSwitch = (Switch)findViewById(R.id.sHiragana);
        tHiraganaSwitch = (Switch)findViewById(R.id.tHiragana);
        nHiraganaSwitch = (Switch)findViewById(R.id.nHiragana);
        hHiraganaSwitch = (Switch)findViewById(R.id.hHiragana);
        mHiraganaSwitch = (Switch)findViewById(R.id.mHiragana);
        yHiraganaSwitch = (Switch)findViewById(R.id.yHiragana);
        rHiraganaSwitch = (Switch)findViewById(R.id.rHiragana);
        wHiraganaSwitch = (Switch)findViewById(R.id.wHiragana);
        just_nHiraganaSwitch = (Switch)findViewById(R.id.just_nHiragana);
        gHiraganaSwitch = (Switch)findViewById(R.id.gHiragana);
        zHiraganaSwitch = (Switch)findViewById(R.id.zHiragana);
        dHiraganaSwitch = (Switch)findViewById(R.id.dHiragana);
        bHiraganaSwitch = (Switch)findViewById(R.id.bHiragana);
        pHiraganaSwitch = (Switch)findViewById(R.id.pHiragana);

        aKatakanaSwitch = (Switch)findViewById(R.id.aKatakana);
        kKatakanaSwitch = (Switch)findViewById(R.id.kKatakana);
        sKatakanaSwitch = (Switch)findViewById(R.id.sKatakana);
        tKatakanaSwitch = (Switch)findViewById(R.id.tKatakana);
        nKatakanaSwitch = (Switch)findViewById(R.id.nKatakana);
        hKatakanaSwitch = (Switch)findViewById(R.id.hKatakana);
        mKatakanaSwitch = (Switch)findViewById(R.id.mKatakana);
        yKatakanaSwitch = (Switch)findViewById(R.id.yKatakana);
        rKatakanaSwitch = (Switch)findViewById(R.id.rKatakana);
        wKatakanaSwitch = (Switch)findViewById(R.id.wKatakana);
        just_nKatakanaSwitch = (Switch)findViewById(R.id.just_nKatakana);
        gKatakanaSwitch = (Switch)findViewById(R.id.gKatakana);
        zKatakanaSwitch = (Switch)findViewById(R.id.zKatakana);
        dKatakanaSwitch = (Switch)findViewById(R.id.dKatakana);
        bKatakanaSwitch = (Switch)findViewById(R.id.bKatakana);
        pKatakanaSwitch = (Switch)findViewById(R.id.pKatakana);
        */


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabHost host = (TabHost) findViewById(R.id.tabHost);
        host.setup();

        // hiragana tab
        TabHost.TabSpec spec = host.newTabSpec("Hiragana");
        spec.setIndicator("Hiragana");
        spec.setContent(R.id.hiraganaOptions);
        host.addTab(spec);

        // katakana tab
        TabHost.TabSpec spec2 = host.newTabSpec("Katakana");
        spec2.setContent(R.id.katakanaOptions); //make the katakana tab
        spec2.setIndicator("Katakana");
        host.addTab(spec2);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, practiceWizard.class);
                startActivity(intent);
            }
        });
        /*
        if(start){
            Intent practiceIntent = new Intent(MainActivity.this, practiceWizard.class);
            startActivity(practiceIntent);
        }
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    public void testLaunch(View view){

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.start_button){
            Intent practiceIntent = new Intent(MainActivity.this, practiceWizard.class);
            startActivity(practiceIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);

        /*
        switch(item.getItemId()){
            case R.id.start_button:
                start = true;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        */
    }



}
