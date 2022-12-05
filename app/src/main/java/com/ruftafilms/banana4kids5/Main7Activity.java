package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void re(View view) {
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.reimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.re);
        MP1.start();
    }
    public void ru(View view) {
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.ruimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ru);
        MP1.start();
    }
    public void ri(View view) {
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.riimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ri);
        MP1.start();
    }
    public void ra(View view) {
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.raimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ra);
        MP1.start();
    }
    public void rie(View view) {
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.rieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.rie);
        MP1.start();
    }
    public void rr(View view) {
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.rrimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.rr);
        MP1.start();
    }
    public void ro(View view) {
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.roimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ro);
        MP1.start();
    }
}
