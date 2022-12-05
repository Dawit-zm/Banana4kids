package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }
    public void qqe(View view) {
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setImageResource(R.drawable.qeeimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qee);
        MP1.start();
    }
    public void qqu(View view) {
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setImageResource(R.drawable.qeeuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qqu);
        MP1.start();
    }
    public void qqi(View view) {
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setImageResource(R.drawable.qeeiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qei);
        MP1.start();
    }
    public void qqa(View view) {
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setImageResource(R.drawable.qeeaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qea);
        MP1.start();
    }
    public void qqie(View view) {
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setImageResource(R.drawable.qeeieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qeie);
        MP1.start();
    }
    public void qq(View view) {
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setImageResource(R.drawable.qqeimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qeq);
        MP1.start();
    }
    public void qqo(View view) {
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setImageResource(R.drawable.qqoimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qeo);
        MP1.start();
    }
}
