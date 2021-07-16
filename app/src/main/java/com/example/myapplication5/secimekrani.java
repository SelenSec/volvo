package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class secimekrani extends AppCompatActivity {
    private TextView Textviewmodeller,Textviewsuv,Textviewsedan,Textviewhatcback
            ,Textviewcrosscountry,Textviewrecharge,Textviewdevam;
    private ImageButton Buttonsuv,Buttonsedan,Buttonhatcback,Buttonrecharge,Buttondevam,Buttoncrosscountry;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secimekrani);

        getSupportActionBar().hide();

        Textviewmodeller=findViewById(R.id.modeller);
        Textviewsuv=findViewById(R.id.textViewsuv);
        Textviewsedan=findViewById(R.id.textViewsedan);
        Textviewcrosscountry=findViewById(R.id.textViewcrosscountry);
        Textviewhatcback=findViewById(R.id.textViewhatchback);
        Textviewrecharge=findViewById(R.id.textViewrecharge);
        Textviewdevam=findViewById(R.id.textViewdevam);

        Buttonsuv=findViewById(R.id.Buttonsuv);
        Buttonsuv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(secimekrani.this,suv.class));
            }
        });
        Buttonsedan=findViewById(R.id.Buttonsedan);
        Buttonsedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(secimekrani.this,sedan.class));
            }
        });
        Buttonrecharge=findViewById(R.id.Buttonrecharge);
        Buttonrecharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(secimekrani.this,recharge.class));
            }
        });
        Buttonhatcback = findViewById(R.id.Buttonhatchback);
        Buttonhatcback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(secimekrani.this,hatchback.class));
            }
        });

        Buttoncrosscountry=findViewById(R.id.Buttoncrosscountry);
        Buttoncrosscountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(secimekrani.this,crosscountry.class));
            }
        });
      Buttondevam=findViewById(R.id.Buttondevam);
      Buttondevam.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(secimekrani.this,araclar.class));

          }
      });

    }
}