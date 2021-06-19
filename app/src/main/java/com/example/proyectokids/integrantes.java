package com.example.proyectokids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class integrantes extends AppCompatActivity {
    private TextView inte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integrantes);
        inte = (TextView) findViewById(R.id.txtv_Integrantes);
        String integrantes = "Integrantes: \n";
        integrantes += "Pedro Alexander Perez Rosales, #323418 \n";
        integrantes += "William Alexander Vasques Hernández, #273815 \n";
        integrantes += "Milton Gerardo Aguilera Ramos, #328218 \n";
        integrantes += "Josue Salvador Reyes Melgar, #229415 \n";

        inte.setText(integrantes);
    }
}