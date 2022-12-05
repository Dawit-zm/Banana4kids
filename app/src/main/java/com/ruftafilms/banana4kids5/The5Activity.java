package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class The5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the5);
    }
    public void hhe(View view) {
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.hheimg);
        MediaPlayer MP1 = MediaPlayer.create(this,R.raw.hhe);
        MP1.start();
    }
    public void hhu(View view) {
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.hhuimg);
        MediaPlayer MP1 = MediaPlayer.create(this,R.raw.hhu);
        MP1.start();
    }
    public void hhi(View view) {
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.hhiimg);
        MediaPlayer MP1 = MediaPlayer.create(this,R.raw.hhi);
        MP1.start();
    }
    public void hha(View view) {
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.hhaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.hha);
        MP1.start();
    }
    public void hhie(View view) {
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.hheiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.hhie);
        MP1.start();
    }
    public void hhh(View view) {
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.hhhimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.hhh);
        MP1.start();
    }
    public void hho(View view) {
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.hhoimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.hho);
        MP1.start();
    }
}
