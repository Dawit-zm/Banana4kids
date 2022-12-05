package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main18Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
    }
    public void kee(View view) {
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
        imageView18.setImageResource(R.drawable.keeimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.kee);
        MP1.start();
    }
    public void keu(View view) {
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
        imageView18.setImageResource(R.drawable.keuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.keu);
        MP1.start();
    }
    public void kei(View view) {
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
        imageView18.setImageResource(R.drawable.keiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.kei);
        MP1.start();
    }
    public void kea(View view) {
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
        imageView18.setImageResource(R.drawable.keaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.kea);
        MP1.start();
    }
    public void keie(View view) {
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
        imageView18.setImageResource(R.drawable.keiemg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.keie);
        MP1.start();
    }
    public void kk(View view) {
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
        imageView18.setImageResource(R.drawable.kkimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.keke);
        MP1.start();
    }
    public void keo(View view) {
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
        imageView18.setImageResource(R.drawable.keoimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.keo);
        MP1.start();
    }
}
