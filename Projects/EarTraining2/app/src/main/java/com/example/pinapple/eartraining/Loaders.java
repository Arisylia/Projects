package com.example.pinapple.eartraining;

import android.content.Context;
import android.media.SoundPool;

/**
 * Created by pinapple on 19/05/2018.
 */

public class Loaders {
    static SoundPool soundPool = new SoundPool(1,1,1);

    public static void loadSounds(Context context){
        MainActivity.a2 = soundPool.load(context, R.raw.a2, 1);
        MainActivity.bb2 = soundPool.load(context, R.raw.bb2, 1);
        MainActivity.b2 = soundPool.load(context, R.raw.b2, 1);
        MainActivity.c2 = soundPool.load(context, R.raw.c2, 1);
        MainActivity.db2 = soundPool.load(context, R.raw.db2, 1);
        MainActivity.d2 = soundPool.load(context, R.raw.d2, 1);
        MainActivity.eb2 = soundPool.load(context, R.raw.eb2, 1);
        MainActivity.e2 = soundPool.load(context, R.raw.e2, 1);
        MainActivity.f2 = soundPool.load(context, R.raw.f2, 1);
        MainActivity.gb2 = soundPool.load(context, R.raw.gb2, 1);
        MainActivity.g2 = soundPool.load(context, R.raw.g2, 1);
        MainActivity.ab2 = soundPool.load(context, R.raw.ab2, 1);
        MainActivity.a3 = soundPool.load(context, R.raw.a3, 1);
        MainActivity.bb3 = soundPool.load(context, R.raw.bb3, 1);
        MainActivity.b3 = soundPool.load(context, R.raw.b3, 1);
        MainActivity.c3 = soundPool.load(context, R.raw.c3, 1);
        MainActivity.db3 = soundPool.load(context, R.raw.db3, 1);
        MainActivity.d3 = soundPool.load(context, R.raw.d3, 1);
        MainActivity.eb3 = soundPool.load(context, R.raw.eb3, 1);
        MainActivity.e3 = soundPool.load(context, R.raw.e3, 1);
        MainActivity.f3 = soundPool.load(context, R.raw.f3, 1);
        MainActivity.gb3 = soundPool.load(context, R.raw.gb3, 1);
        MainActivity.g3 = soundPool.load(context, R.raw.g3, 1);
        MainActivity.ab3 = soundPool.load(context, R.raw.ab3, 1);
        MainActivity.a4 = soundPool.load(context, R.raw.a4, 1);
        MainActivity.bb4 = soundPool.load(context, R.raw.bb4, 1);
        MainActivity.b4 = soundPool.load(context, R.raw.b4, 1);
        MainActivity.c4 = soundPool.load(context, R.raw.c4, 1);
        MainActivity.db4 = soundPool.load(context, R.raw.db4, 1);
        MainActivity.d4 = soundPool.load(context, R.raw.d4, 1);
        MainActivity.eb4 = soundPool.load(context, R.raw.eb4, 1);
        MainActivity.e4 = soundPool.load(context, R.raw.e4, 1);
        MainActivity.f4 = soundPool.load(context, R.raw.f4, 1);
        MainActivity.gb4 = soundPool.load(context, R.raw.gb4, 1);
        MainActivity.g4 = soundPool.load(context, R.raw.g4, 1);
        MainActivity.ab4 = soundPool.load(context, R.raw.ab4, 1);
        MainActivity.a5 = soundPool.load(context, R.raw.a5, 1);
        MainActivity.bb5 = soundPool.load(context, R.raw.bb5, 1);
        MainActivity.b5 = soundPool.load(context, R.raw.b5, 1);
        MainActivity.c5 = soundPool.load(context, R.raw.c5, 1);
        MainActivity.db5 = soundPool.load(context, R.raw.db5, 1);
        MainActivity.d5 = soundPool.load(context, R.raw.d5, 1);
        MainActivity.eb5 = soundPool.load(context, R.raw.eb5, 1);
        MainActivity.e5 = soundPool.load(context, R.raw.e5, 1);
        MainActivity.f5 = soundPool.load(context, R.raw.f5, 1);
        MainActivity.gb5 = soundPool.load(context, R.raw.gb5, 1);
        MainActivity.g5 = soundPool.load(context, R.raw.g5, 1);
        MainActivity.ab5 = soundPool.load(context, R.raw.ab5, 1);
        MainActivity.a6 = soundPool.load(context, R.raw.a6, 1);
        MainActivity.bb6 = soundPool.load(context, R.raw.bb6, 1);
        MainActivity.b6 = soundPool.load(context, R.raw.b6, 1);
        MainActivity.c6 = soundPool.load(context, R.raw.c6, 1);
        MainActivity.db6 = soundPool.load(context, R.raw.db6, 1);
        MainActivity.d6 = soundPool.load(context, R.raw.d6, 1);
        MainActivity.eb6 = soundPool.load(context, R.raw.eb6, 1);
        MainActivity.e6 = soundPool.load(context, R.raw.e6, 1);
        MainActivity.f6 = soundPool.load(context, R.raw.f6, 1);
        MainActivity.gb6 = soundPool.load(context, R.raw.gb6, 1);
        MainActivity.g6 = soundPool.load(context, R.raw.g6, 1);
        MainActivity.ab6 = soundPool.load(context, R.raw.ab6, 1);
    }

    public static void loadIntervalButtons(){
        Intervals instance = new Intervals();
        Intervals.unison = instance.findViewById(R.id.union);
        Intervals.min2 = instance.findViewById(R.id.min2);
        Intervals.maj2 = instance.findViewById(R.id.maj2);
        Intervals.min3 = instance.findViewById(R.id.min3);
        Intervals.maj3 = instance.findViewById(R.id.maj3);
        Intervals.p4 = instance.findViewById(R.id.p4);
        Intervals.tritone = instance.findViewById(R.id.tritone);
        Intervals.p5 = instance.findViewById(R.id.p5);
        Intervals.min6 = instance.findViewById(R.id.min6);
        Intervals.maj6 = instance.findViewById(R.id.maj6);
        Intervals.min7 = instance.findViewById(R.id.min7);
        Intervals.maj7 = instance.findViewById(R.id.maj7);
        Intervals.octave = instance.findViewById(R.id.octave);
        Intervals.min9 = instance.findViewById(R.id.min9);
        Intervals.maj9 = instance.findViewById(R.id.maj9);
        Intervals.min10 = instance.findViewById(R.id.min10);
        Intervals.maj10 = instance.findViewById(R.id.maj10);
    }
}
