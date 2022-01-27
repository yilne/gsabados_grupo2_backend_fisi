package com.example.dsm_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton verMas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        verMas = findViewById(R.id.imageCheck);

        verMas.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,modal_solicitud.class)));
    }


}