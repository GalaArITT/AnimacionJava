package com.example.oliver.animacionjava;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
        button = (Button) findViewById(R.id.btnRun);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.animate().translationX(400).translationY(400).translationX(50).translationY(100).rotation(560).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        Log.i("Animation", "onAnimationStart");
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        Log.i("Animation", "onAnimationEnd");
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
            }
        });
    }
}
