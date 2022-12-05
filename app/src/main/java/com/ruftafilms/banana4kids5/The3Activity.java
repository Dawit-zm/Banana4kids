package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class The3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the3);
    }

    public void ddd(View view) {
        ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.heimg);
        MediaPlayer MP1 = MediaPlayer.create(this,R.raw.he);
        MP1.start();

    }
    public void eta(View view) {
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.huimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.hu);
        MP1.start();
    }
    public void hi(View view) {
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.hiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.hi);
        MP1.start();
    }
    public void ha(View view) {
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.haimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ha);
        MP1.start();
    }
    public void hie(View view) {
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.hieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.hie);
        MP1.start();
    }
    public void hh(View view) {
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.hhimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.hh);
        MP1.start();
    }
    public void ho(View view) {
        ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.hoimg);
        MediaPlayer MP1 = MediaPlayer.create(this,R.raw.ho);
        MP1.start();
    }
}
