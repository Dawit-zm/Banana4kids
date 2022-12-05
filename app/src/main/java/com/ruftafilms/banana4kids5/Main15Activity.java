package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main15Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
    }
    public void che(View view) {
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView15.setImageResource(R.drawable.neimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ne);
        MP1.start();
    }
    public void chu(View view) {
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView15.setImageResource(R.drawable.nuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.nu);
        MP1.start();
    }
    public void chi(View view) {
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView15.setImageResource(R.drawable.niimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ni);
        MP1.start();
    }
    public void cha(View view) {
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView15.setImageResource(R.drawable.naimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.na);
        MP1.start();
    }
    public void chie(View view) {
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView15.setImageResource(R.drawable.nieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.nie);
        MP1.start();
    }
    public void ch(View view) {
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView15.setImageResource(R.drawable.nimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.n);
        MP1.start();
    }
    public void cho(View view) {
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView15.setImageResource(R.drawable.noimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.no);
        MP1.start();
    }
}
