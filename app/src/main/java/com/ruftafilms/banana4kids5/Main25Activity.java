package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main25Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
    }
    public void ge(View view) {
        ImageView imageView25 = (ImageView) findViewById(R.id.imageView25);
        imageView25.setImageResource(R.drawable.geimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ge);
        MP1.start();
    }
    public void gu(View view) {
        ImageView imageView25 = (ImageView) findViewById(R.id.imageView25);
        imageView25.setImageResource(R.drawable.guimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.gu);
        MP1.start();
    }
    public void gi(View view) {
        ImageView imageView25 = (ImageView) findViewById(R.id.imageView25);
        imageView25.setImageResource(R.drawable.giimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.gi);
        MP1.start();
    }
    public void ga(View view) {
        ImageView imageView25 = (ImageView) findViewById(R.id.imageView25);
        imageView25.setImageResource(R.drawable.gaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ga);
        MP1.start();
    }
    public void gie(View view) {
        ImageView imageView25 = (ImageView) findViewById(R.id.imageView25);
        imageView25.setImageResource(R.drawable.gieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.gie);
        MP1.start();
    }
    public void g(View view) {
        ImageView imageView25 = (ImageView) findViewById(R.id.imageView25);
        imageView25.setImageResource(R.drawable.gimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.g);
        MP1.start();
    }
    public void go(View view) {
        ImageView imageView25 = (ImageView) findViewById(R.id.imageView25);
        imageView25.setImageResource(R.drawable.goimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.go);
        MP1.start();
    }
}

