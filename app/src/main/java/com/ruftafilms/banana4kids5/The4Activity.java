package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class The4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the4);
    }
    public void le(View view) {
        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.leimg);
        MediaPlayer MP1 = MediaPlayer.create(this,R.raw.le);
        MP1.start();
    }
    public void lu(View view) {
        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.luimg);
        MediaPlayer MP1 = MediaPlayer.create(this,R.raw.lu);
        MP1.start();
    }
    public void li(View view) {
        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.liimg);
        MediaPlayer MP1 = MediaPlayer.create(this,R.raw.li);
        MP1.start();
    }
    public void la(View view) {
        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.laimg);
        MediaPlayer MP1 = MediaPlayer.create(this,R.raw.la);
        MP1.start();
    }
    public void lie(View view) {
        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.lieimg);
        MediaPlayer MP1 = MediaPlayer.create(this,R.raw.lie);
        MP1.start();
    }
    public void ll(View view) {
        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.llimg);
        MediaPlayer MP1 = MediaPlayer.create(this,R.raw.ll);
        MP1.start();
    }
    public void lo(View view) {
        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.loimg);
        MediaPlayer MP1 = MediaPlayer.create(this,R.raw.lo);
        MP1.start();
    }
}

