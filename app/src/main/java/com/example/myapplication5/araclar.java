package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class araclar extends AppCompatActivity {
    private TextView acıklama;
    private Button buttongerison;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_araclar);

        buttongerison=findViewById(R.id.buttongerison);
        acıklama=findViewById(R.id.acıklama);

        buttongerison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}