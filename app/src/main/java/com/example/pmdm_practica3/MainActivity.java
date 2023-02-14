package com.example.pmdm_practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button alta;
    Button ver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alta = (Button) findViewById(R.id.altaBtn);
        alta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, alta.class);
                startActivity(intent);
                onStop();
            }
        });

        ver = (Button) findViewById(R.id.verBtn);
        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ver.class);
                startActivity(intent);
                onStop();
            }
        });
    }

}