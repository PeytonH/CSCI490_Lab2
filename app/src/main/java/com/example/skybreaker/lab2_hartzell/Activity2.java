package com.example.skybreaker.lab2_hartzell;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by SkyBreaker on 2/15/2018.
 */

public class Activity2 extends AppCompatActivity
{

        private ImageView supermoonImg;
        private ImageView waterfallImg;

        private int imageID;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity2);

            supermoonImg = findViewById(R.id.supermoon);
            waterfallImg = findViewById(R.id.waterfall);

            supermoonImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "I clicked supermoon", Toast.LENGTH_SHORT).show();
                    imageID = R.drawable.supermoon;
                    finish();

                }
            });

            waterfallImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "I clicked waterfall", Toast.LENGTH_SHORT).show();
                    imageID = R.drawable.waterfall;
                    finish();
                }
            });

        }

        @Override
        public void finish() {
            Intent intent = new Intent();
            intent.putExtra("imageID", imageID);

            setResult(RESULT_OK, intent);
            super.finish();
        }

    }

