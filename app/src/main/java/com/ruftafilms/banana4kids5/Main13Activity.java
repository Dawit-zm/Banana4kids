package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
    }
    public void ve(View view) {
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView13.setImageResource(R.drawable.teeimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.tee);
        MP1.start();
    }
    public void vu(View view) {
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView13.setImageResource(R.drawable.teuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.teu);
        MP1.start();

    }
    public void vi(View view) {
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView13.setImageResource(R.drawable.teiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.tei);
        MP1.start();

    }
    public void va(View view) {
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView13.setImageResource(R.drawable.teaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.tea);
        MP1.start();


    }
    public void vie(View view) {
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView13.setImageResource(R.drawable.teieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.teie);
        MP1.start();

    }
    public void v(View view) {
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView13.setImageResource(R.drawable.teteimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.teetee);
        MP1.start();

    }
    public void vo(View view) {
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView13.setImageResource(R.drawable.teoimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.teo);
        MP1.start();
       
    }
}
