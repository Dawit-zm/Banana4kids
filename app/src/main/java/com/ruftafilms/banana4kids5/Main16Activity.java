package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main16Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
    }
    public void ee(View view) {
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        imageView16.setImageResource(R.drawable.eeimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ee);
        MP1.start();
    }
    public void eu(View view) {
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        imageView16.setImageResource(R.drawable.euimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.eu);
        MP1.start();
    }
    public void ei(View view) {
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        imageView16.setImageResource(R.drawable.eiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ei);
        MP1.start();
    }
    public void ea(View view) {
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        imageView16.setImageResource(R.drawable.eaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ea);
        MP1.start();
    }
    public void eie(View view) {
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        imageView16.setImageResource(R.drawable.eieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.eie);
        MP1.start();
    }
    public void e(View view) {
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        imageView16.setImageResource(R.drawable.eimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.e);
        MP1.start();
    }
    public void eo(View view) {
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        imageView16.setImageResource(R.drawable.eoimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.eo);
        MP1.start();
    }
}
