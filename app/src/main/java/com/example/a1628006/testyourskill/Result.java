package com.example.a1628006.testyourskill;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {

     TextView t1,t2,t3;
    int score;
    String sc;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t1 = findViewById(R.id.textView2);
        t2 = findViewById(R.id.textView3);
        t3 = findViewById(R.id.textView4);
        Intent i = getIntent();
        sc = i.getStringExtra("value");
        score = Integer.parseInt(sc);
        if (score == 0) {
            t1.setText("Your Score is " + (score * 20) + "%");
            t2.setText("You are a incomer!");
            t3.setText("You can learn new things at \n any time in your life if you're \n  willing to be a beginner. If  \n  you actually learn to like being a \n beginner,the whole world opens up \n to you.");
        } else if (score == 1) {
            t1.setText("Your Score is " + (score * 20) + "%");
            t2.setText("You are a Padawan!");
            t3.setText("You are at the beginning of your journey \n with marketing and you still have a lot to \n learn, but fear not. Find your very own \n marketing Yoda ");
        } else if (score == 2) {
            t1.setText("Your Score is " + (score * 20) + "%");
            t2.setText("You are a Sophomore!");
            t3.setText("You know a lot, but there is still space \n to improve and learn more!");
        } else if (score == 3) {
            t1.setText("Your Score is " + (score * 20) + "%");
            t2.setText("You are a Marketing Ninja!");
            t3.setText("Your knowledge on marketing is\n truly impressive and your competitors \n tremble when thinking of you!");
        } else if (score == 4) {
            t1.setText("Your Score is " + (score * 20) + "%");
            t2.setText("You are a marketing Jedi!");
            t3.setText("You have no weaknesses and you \n  know it all - your company's galaxy is safe with you! ");
        }
        else if (score == 5) {
            t1.setText("Your Score is " + (score * 20) + "%");
            t2.setText("You are a facile!");
            t3.setText("Your investment in knowledge pays \n the best interest to your company!");
        }


    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back press disabled!", Toast.LENGTH_SHORT).show();
    }

}
