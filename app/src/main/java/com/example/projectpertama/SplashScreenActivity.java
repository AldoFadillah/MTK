package com.example.projectpertama;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    TextView tvSplash;
    ProgressBar progressBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        tvSplash = (TextView) findViewById(R.id.tvSplash);
        progressBar1 = findViewById(R.id.progresBar1);

        progressBar1.setMax(100);
        progressBar1.setScaleY(3f);

        progressAnimation();


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 7700); //3000 L = 3 detik
    }
    public void progressAnimation(){
        ProgressBarAnimation anim = new ProgressBarAnimation(this, progressBar1, tvSplash, 1f, 100f);
        anim.setDuration(8700);
        progressBar1.setAnimation(anim);
    }
}
