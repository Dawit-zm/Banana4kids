package com.ruftafilms.banana4kids5;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main17Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
    }
    public void ke(View view) {
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView17.setImageResource(R.drawable.keimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ke);
        MP1.start();
    }
    public void ku(View view) {
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView17.setImageResource(R.drawable.kuimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ku);
        MP1.start();
    }
    public void ki(View view) {
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView17.setImageResource(R.drawable.kiimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ki);
        MP1.start();
    }
    public void ka(View view) {
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView17.setImageResource(R.drawable.kaimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ka);
        MP1.start();
    }
    public void kie(View view) {
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView17.setImageResource(R.drawable.kieimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.kie);
        MP1.start();
    }
    public void k(View view) {
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView17.setImageResource(R.drawable.kimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.k);
        MP1.start();
    }
    public void ko(View view) {
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView17.setImageResource(R.drawable.koimg);
        MediaPlayer MP1 = MediaPlayer.create(this, R.raw.ko);
        MP1.start();
    }
}
