package com.example.proyectokids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView socialesImage;
    private ImageView cienciasImage;
    private ImageView mateImage;
    private ImageView lenguaImage;
    private TextView showSociales;
    private TextView showCiencias;
    private TextView showMate;
    private TextView showLengua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        socialesImage = (ImageView) findViewById(R.id.img_Sociales);
        cienciasImage = (ImageView) findViewById(R.id.img_Ciencias);
        mateImage = (ImageView) findViewById(R.id.img_Mate);
        lenguaImage = (ImageView) findViewById(R.id.img_Lengua);

        cienciasImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ciencias", Toast.LENGTH_SHORT).show();
            }
        });
        socialesImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sociales", Toast.LENGTH_SHORT).show();
            }
        });
        mateImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Matematica", Toast.LENGTH_SHORT).show();
            }
        });
        lenguaImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Lenguaje", Toast.LENGTH_SHORT).show();
            }
        });
    }
}