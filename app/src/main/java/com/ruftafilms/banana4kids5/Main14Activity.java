package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main14Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
    }
    public void te(View view) {
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView14.setImageResource(R.drawable.teimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.te);
        MP1.start();
    }
    public void tu(View view) {
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView14.setImageResource(R.drawable.tuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.tu);
        MP1.start();
    }
    public void ta(View view) {
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView14.setImageResource(R.drawable.taimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ta);
        MP1.start();
    }
    public void ti(View view) {
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView14.setImageResource(R.drawable.tiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ti);
        MP1.start();
    }
    public void tie(View view) {
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView14.setImageResource(R.drawable.tieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.tie);
        MP1.start();
    }
    public void t(View view) {
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView14.setImageResource(R.drawable.timg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.t);
        MP1.start();
    }
    public void to(View view) {
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView14.setImageResource(R.drawable.toimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.to);
        MP1.start();
    }
}
