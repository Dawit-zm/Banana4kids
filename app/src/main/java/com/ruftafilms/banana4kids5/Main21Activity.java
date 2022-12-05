package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main21Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
    }
    public void ze(View view) {
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView21.setImageResource(R.drawable.zeimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ze);
        MP1.start();
    }
    public void zu(View view) {
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView21.setImageResource(R.drawable.zuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.zu);
        MP1.start();
    }
    public void zi(View view) {
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView21.setImageResource(R.drawable.ziimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.zi);
        MP1.start();
    }
    public void za(View view) {
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView21.setImageResource(R.drawable.zaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.za);
        MP1.start();
    }
    public void zie(View view) {
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView21.setImageResource(R.drawable.zieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.zie);
        MP1.start();
    }
    public void z(View view) {
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView21.setImageResource(R.drawable.zimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.z);
        MP1.start();
    }
    public void zo(View view) {
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView21.setImageResource(R.drawable.zoimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.zo);
        MP1.start();
    }
}
