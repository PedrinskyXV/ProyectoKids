package com.example.proyectokids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pregunta_mate_2 extends AppCompatActivity {
    private Button R1;
    private Button R2;
    private Button R3;
    private Button R4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_mate2);

        R1 = (Button) findViewById(R.id.buttonR1);
        R2 = (Button) findViewById(R.id.buttonR2);
        R3 = (Button) findViewById(R.id.buttonR3);
        R4 = (Button) findViewById(R.id.buttonR4);

        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(pregunta_mate_2.this, "Respuesta Incorrecta :(", Toast.LENGTH_SHORT).show();
            }
        });

        R2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(pregunta_mate_2.this, "Respuesta Incorrecta :(", Toast.LENGTH_SHORT).show();
            }
        });

        R3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(pregunta_mate_2.this, "Respuesta Incorrecta :(", Toast.LENGTH_SHORT).show();
            }
        });

        R4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(pregunta_mate_2.this, "Respuesta Correcta :)", Toast.LENGTH_SHORT).show();
            }
        });
    }
}