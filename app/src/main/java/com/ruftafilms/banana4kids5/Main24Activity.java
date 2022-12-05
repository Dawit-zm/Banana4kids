package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main24Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);
    }
    public void je(View view) {
        ImageView imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView24.setImageResource(R.drawable.jeimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.je);
        MP1.start();
    }
    public void ju(View view) {
        ImageView imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView24.setImageResource(R.drawable.juimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ju);
        MP1.start();
    }
    public void ji(View view) {
        ImageView imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView24.setImageResource(R.drawable.jiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ji);
        MP1.start();
    }
    public void ja(View view) {
        ImageView imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView24.setImageResource(R.drawable.jaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ja);
        MP1.start();
    }
    public void jie(View view) {
        ImageView imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView24.setImageResource(R.drawable.jieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.jie);
        MP1.start();
    }
    public void j(View view) {
        ImageView imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView24.setImageResource(R.drawable.jimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.j);
        MP1.start();
    }
    public void jo(View view) {
        ImageView imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView24.setImageResource(R.drawable.joimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.jo);
        MP1.start();
    }
}
