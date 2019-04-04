package com.example.a1628006.testyourskill;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    Button a1;
    Button a2;
    Button a3;
    Button a4;
    int score;
    String sc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        a1 = findViewById(R.id.button2);
        a2 = findViewById(R.id.button3);
        a3 = findViewById(R.id.button4);
        a4 = findViewById(R.id.button5);
        Intent i=getIntent();
        sc=i.getStringExtra("value");
        score=Integer.parseInt(sc);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1.setBackgroundColor(Color.RED);
                a3.setBackgroundColor(Color.GREEN);
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                a4.setEnabled(false);
                startnext();
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a2.setBackgroundColor(Color.RED);
                a3.setBackgroundColor(Color.GREEN);
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                a4.setEnabled(false);
                startnext();
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a3.setBackgroundColor(Color.GREEN);
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                a4.setEnabled(false);
                score=score+1;
                startnext();
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a4.setBackgroundColor(Color.RED);
                a3.setBackgroundColor(Color.GREEN);
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
                a4.setEnabled(false);
                startnext();

            }
        });

    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back press disabled!", Toast.LENGTH_SHORT).show();
    }


    public void startnext() {
        Handler hs = new Handler();
        hs.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Main3Activity.this, Main5Activity.class);
                String sc1=String.valueOf(score);
                i.putExtra("value",sc1);
                startActivity(i);
            }
        }, 1000);
    }




}
