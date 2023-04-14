package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button bt;
    ImageView dimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.button);
        dimg = findViewById(R.id.imageView);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll();
            }
        });
    }
    public void roll(){
        Animation anim;
        anim= AnimationUtils.loadAnimation(this,R.anim.rotate);
        dimg.startAnimation(anim);
        int randomNum = 1 + (int)(Math.random() * 6);
        switch (randomNum)
        {
            case 1:
                dimg.setImageResource(R.drawable.dc_1);
                break;
            case 2:
                dimg.setImageResource(R.drawable.dc_2);
                break;
            case 3:
                dimg.setImageResource(R.drawable.dc_3);
                break;
            case 4:
                dimg.setImageResource(R.drawable.dc_4);
                break;
            case 5:
                dimg.setImageResource(R.drawable.dc_5);
                break;
            case 6:
                dimg.setImageResource(R.drawable.dc_6);
                break;
        }
    }
}