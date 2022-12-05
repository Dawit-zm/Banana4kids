package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
    }
    public void ye(View view) {
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView22.setImageResource(R.drawable.yeimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ye);
        MP1.start();
    }
    public void yu(View view) {
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView22.setImageResource(R.drawable.yuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.yu);
        MP1.start();
    }
    public void ya(View view) {
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView22.setImageResource(R.drawable.yaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ya);
        MP1.start();
    }
    public void yi(View view) {
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView22.setImageResource(R.drawable.yiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.yi);
        MP1.start();
    }
    public void yie(View view) {
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView22.setImageResource(R.drawable.yieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.yie);
        MP1.start();
    }
    public void y(View view) {
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView22.setImageResource(R.drawable.yimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.y);
        MP1.start();
    }
    public void yo(View view) {
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView22.setImageResource(R.drawable.yoimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.yo);
        MP1.start();
    }

}
