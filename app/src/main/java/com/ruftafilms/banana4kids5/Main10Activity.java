package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }
    public void qe(View view) {
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView10.setImageResource(R.drawable.qeimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qe);
        MP1.start();
    }
    public void qu(View view) {
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView10.setImageResource(R.drawable.quimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qu);
        MP1.start();
    }
    public void qa(View view) {
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView10.setImageResource(R.drawable.qaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qa);
        MP1.start();
    }
    public void qi(View view) {
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView10.setImageResource(R.drawable.qiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qi);
        MP1.start();
    }
    public void qie(View view) {
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView10.setImageResource(R.drawable.qieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qie);
        MP1.start();
    }
    public void qq(View view) {
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView10.setImageResource(R.drawable.qqimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qq);
        MP1.start();
    }
    public void qo(View view) {
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView10.setImageResource(R.drawable.qoimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.qo);
        MP1.start();
    }
}
