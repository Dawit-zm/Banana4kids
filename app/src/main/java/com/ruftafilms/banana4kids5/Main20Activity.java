package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main20Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
    }
    public void oe(View view) {
        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);
        imageView20.setImageResource(R.drawable.oeimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.oe);
        MP1.start();
    }
    public void ou(View view) {
        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);
        imageView20.setImageResource(R.drawable.ouimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ou);
        MP1.start();
    }
    public void oi(View view) {
        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);
        imageView20.setImageResource(R.drawable.oiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.oi);
        MP1.start();
    }
    public void oa(View view) {
        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);
        imageView20.setImageResource(R.drawable.oaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.oa);
        MP1.start();
    }
    public void oie(View view) {
        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);
        imageView20.setImageResource(R.drawable.oieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.oie);
        MP1.start();
    }
    public void o(View view) {
        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);
        imageView20.setImageResource(R.drawable.oimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.o);
        MP1.start();
    }
    public void oo(View view) {
        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);
        imageView20.setImageResource(R.drawable.ooimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.oo);
        MP1.start();
    }
}
