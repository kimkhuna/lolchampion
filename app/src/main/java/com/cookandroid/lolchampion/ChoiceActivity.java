package com.cookandroid.lolchampion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ChoiceActivity extends AppCompatActivity {

    private ImageButton garen, galio, gankplank, gragas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        Intent intent = getIntent();

        garen = findViewById(R.id.garen);
        galio = findViewById(R.id.galio);
        gankplank = findViewById(R.id.gankplank);
        gragas = findViewById(R.id.gragas);

        garen.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(ChoiceActivity.this, GarenActivity.class);
                startActivity(intent);
                return false;
            }
        });


    }

}
