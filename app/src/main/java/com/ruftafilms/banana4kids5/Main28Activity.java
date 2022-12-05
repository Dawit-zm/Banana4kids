package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main28Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main28);
    }
    public void fe(View view) {
        ImageView imageView28 = (ImageView) findViewById(R.id.imageView28);
        imageView28.setImageResource(R.drawable.feimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.fe);
        MP1.start();
    }
    public void fu(View view) {
        ImageView imageView28 = (ImageView) findViewById(R.id.imageView28);
        imageView28.setImageResource(R.drawable.fuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.fu);
        MP1.start();
    }
    public void fi(View view) {
        ImageView imageView28 = (ImageView) findViewById(R.id.imageView28);
        imageView28.setImageResource(R.drawable.fiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.fi);
        MP1.start();
    }
    public void fa(View view) {
        ImageView imageView28 = (ImageView) findViewById(R.id.imageView28);
        imageView28.setImageResource(R.drawable.faimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.fa);
        MP1.start();
    }
    public void fie(View view) {
        ImageView imageView28 = (ImageView) findViewById(R.id.imageView28);
        imageView28.setImageResource(R.drawable.fieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.fie);
        MP1.start();
    }
    public void f(View view) {
        ImageView imageView28 = (ImageView) findViewById(R.id.imageView28);
        imageView28.setImageResource(R.drawable.fimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.f);
        MP1.start();
    }
    public void fo(View view) {
        ImageView imageView28 = (ImageView) findViewById(R.id.imageView28);
        imageView28.setImageResource(R.drawable.foimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.fo);
        MP1.start();
    }
}
