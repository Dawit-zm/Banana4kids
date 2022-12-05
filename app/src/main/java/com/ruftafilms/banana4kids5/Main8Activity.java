package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void se(View view) {
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView7.setImageResource(R.drawable.seimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.se);
        MP1.start();
    }
    public void su(View view) {
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView7.setImageResource(R.drawable.suimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.su);
        MP1.start();
    }
    public void si(View view) {
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView7.setImageResource(R.drawable.siimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.si);
        MP1.start();
    }
    public void sa(View view) {
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView7.setImageResource(R.drawable.saimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.sa);
        MP1.start();
    }
    public void sie(View view) {
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView7.setImageResource(R.drawable.sieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.sie);
        MP1.start();
    }
    public void ss(View view) {
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView7.setImageResource(R.drawable.ssimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ss);
        MP1.start();
    }
    public void so(View view) {
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView7.setImageResource(R.drawable.soimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.so);
        MP1.start();
    }
}
