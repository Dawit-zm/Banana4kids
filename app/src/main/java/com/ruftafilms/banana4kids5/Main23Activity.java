package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main23Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
    }
    public void de(View view) {
        ImageView imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView23.setImageResource(R.drawable.deimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.de);
        MP1.start();
    }
    public void du(View view) {
        ImageView imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView23.setImageResource(R.drawable.duimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.du);
        MP1.start();
    }
    public void di(View view) {
        ImageView imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView23.setImageResource(R.drawable.diimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.di);
        MP1.start();
    }
    public void da(View view) {
        ImageView imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView23.setImageResource(R.drawable.daimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.da);
        MP1.start();
    }
    public void die(View view) {
        ImageView imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView23.setImageResource(R.drawable.dieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.die);
        MP1.start();
    }
    public void d(View view) {
        ImageView imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView23.setImageResource(R.drawable.dimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.d);
        MP1.start();
    }
    public void doo(View view) {
        ImageView imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView23.setImageResource(R.drawable.dooimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.doo);
        MP1.start();
    }
}
