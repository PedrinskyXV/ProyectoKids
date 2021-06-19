package com.example.proyectokids;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class pregunta_mate_5 extends AppCompatActivity {
    private Button R1;
    private Button R2;
    private Button R3;
    private Button R4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_mate5);

        R1 = (Button) findViewById(R.id.buttonR1);
        R2 = (Button) findViewById(R.id.buttonR2);
        R3 = (Button) findViewById(R.id.buttonR3);
        R4 = (Button) findViewById(R.id.buttonR4);

        String correcta = "Respuesta Correcta :).";
        String incorrecta = "Respuesta Incorrecta :(.";

        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(pregunta_mate_5.this, incorrecta, Toast.LENGTH_SHORT).show();
            }
        });

        R2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(pregunta_mate_5.this, incorrecta, Toast.LENGTH_SHORT).show();
            }
        });

        R3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(pregunta_mate_5.this, incorrecta, Toast.LENGTH_SHORT).show();
            }
        });

        R4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(pregunta_mate_5.this, correcta + " Felicidades !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}