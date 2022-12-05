package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }
    public void she(View view) {
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setImageResource(R.drawable.sheimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.she);
        MP1.start();
    }
    public void shu(View view) {
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setImageResource(R.drawable.shuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.shu);
        MP1.start();
    }
    public void shi(View view) {
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setImageResource(R.drawable.shiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.shi);
        MP1.start();
    }
    public void sha(View view) {
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setImageResource(R.drawable.shaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.sha);
        MP1.start();
    }
    public void shie(View view) {
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setImageResource(R.drawable.shieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.shie);
        MP1.start();
    }
    public void sh(View view) {
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setImageResource(R.drawable.shimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.sh);
        MP1.start();
    }
    public void sho(View view) {
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setImageResource(R.drawable.shoimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.sho);
        MP1.start();
    }
}
