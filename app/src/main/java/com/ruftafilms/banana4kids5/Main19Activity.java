package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main19Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
    }
    public void we(View view) {
        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
        imageView19.setImageResource(R.drawable.weimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.we);
        MP1.start();
    }
    public void wu(View view) {
        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
        imageView19.setImageResource(R.drawable.wuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.wu);
        MP1.start();
    }
    public void wi(View view) {
        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
        imageView19.setImageResource(R.drawable.wiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.wi);
        MP1.start();
    }
    public void wa(View view) {
        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
        imageView19.setImageResource(R.drawable.waimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.wa);
        MP1.start();
    }
    public void wie(View view) {
        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
        imageView19.setImageResource(R.drawable.wieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.wie);
        MP1.start();
    }
    public void w(View view) {
        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
        imageView19.setImageResource(R.drawable.wimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.w);
        MP1.start();
    }
    public void wo(View view) {
        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
        imageView19.setImageResource(R.drawable.woimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.wo);
        MP1.start();
    }
}
