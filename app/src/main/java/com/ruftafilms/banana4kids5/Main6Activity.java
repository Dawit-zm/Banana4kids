
package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main62);
    }
    public void me(View view) {
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.meimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.me);
        MP1.start();
    }
    public void mu(View view) {
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.muimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.mu);
        MP1.start();
    }
    public void mi(View view) {
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.miimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.mi);
        MP1.start();
    }
    public void ma(View view) {
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.maimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ma);
        MP1.start();
    }
    public void mie(View view) {
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.mieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.mie);
        MP1.start();
    }
    public void m(View view) {
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.mmimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.mm);
        MP1.start();
    }
    public void mo(View view) {
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.moimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.mo);
        MP1.start();
    }
}
