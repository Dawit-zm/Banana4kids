package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main27Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);
    }
    public void xe(View view) {
        ImageView imageView27 = (ImageView) findViewById(R.id.imageView27);
        imageView27.setImageResource(R.drawable.xeimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.xe);
        MP1.start();
    }
    public void xu(View view) {
        ImageView imageView27 = (ImageView) findViewById(R.id.imageView27);
        imageView27.setImageResource(R.drawable.xuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.xu);
        MP1.start();
    }
    public void xa(View view) {
        ImageView imageView27 = (ImageView) findViewById(R.id.imageView27);
        imageView27.setImageResource(R.drawable.xaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.xa);
        MP1.start();
    }
    public void xie(View view) {
        ImageView imageView27 = (ImageView) findViewById(R.id.imageView27);
        imageView27.setImageResource(R.drawable.xieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.xie);
        MP1.start();
    }
    public void x(View view) {
        ImageView imageView27 = (ImageView) findViewById(R.id.imageView27);
        imageView27.setImageResource(R.drawable.ximg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.x);
        MP1.start();
    }
    public void xo(View view) {
        ImageView imageView27 = (ImageView) findViewById(R.id.imageView27);
        imageView27.setImageResource(R.drawable.xoimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.xo);
        MP1.start();
    }
    public void xi(View view) {
        ImageView imageView27 = (ImageView) findViewById(R.id.imageView27);
        imageView27.setImageResource(R.drawable.xiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.xi);
        MP1.start();
    }
}
