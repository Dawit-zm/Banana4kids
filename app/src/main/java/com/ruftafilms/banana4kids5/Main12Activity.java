package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }
    public void be(View view) {
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView12.setImageResource(R.drawable.beimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.be);
        MP1.start();
    }
    public void bu(View view) {
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView12.setImageResource(R.drawable.buimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.bu);
        MP1.start();
    }
    public void bi(View view) {
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView12.setImageResource(R.drawable.biimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.bi);
        MP1.start();
    }
    public void ba(View view) {
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView12.setImageResource(R.drawable.baimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ba);
        MP1.start();
    }
    public void bie(View view) {
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView12.setImageResource(R.drawable.bieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.bie);
        MP1.start();
    }
    public void b(View view) {
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView12.setImageResource(R.drawable.bimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.b);
        MP1.start();
    }
    public void bo(View view) {
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView12.setImageResource(R.drawable.boimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.bo);
        MP1.start();
    }
}
