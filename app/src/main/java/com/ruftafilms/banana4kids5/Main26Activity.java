package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main26Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main26);
    }
    public void ce(View view) {
        ImageView imageView26 = (ImageView) findViewById(R.id.imageView26);
        imageView26.setImageResource(R.drawable.ceimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ce);
        MP1.start();
    }
    public void cu(View view) {
        ImageView imageView26 = (ImageView) findViewById(R.id.imageView26);
        imageView26.setImageResource(R.drawable.cuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.cu);
        MP1.start();
    }
    public void ca(View view) {
        ImageView imageView26 = (ImageView) findViewById(R.id.imageView26);
        imageView26.setImageResource(R.drawable.caimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ca);
        MP1.start();
    }
    public void cie(View view) {
        ImageView imageView26 = (ImageView) findViewById(R.id.imageView26);
        imageView26.setImageResource(R.drawable.cieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.cie);
        MP1.start();
    }
    public void c(View view) {
        ImageView imageView26 = (ImageView) findViewById(R.id.imageView26);
        imageView26.setImageResource(R.drawable.cimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.c);
        MP1.start();
    }
    public void co(View view) {
        ImageView imageView26 = (ImageView) findViewById(R.id.imageView26);
        imageView26.setImageResource(R.drawable.coimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.co);
        MP1.start();
    }
    public void ci(View view) {
        ImageView imageView26 = (ImageView) findViewById(R.id.imageView26);
        imageView26.setImageResource(R.drawable.ciimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ci);
        MP1.start();
    }
}
