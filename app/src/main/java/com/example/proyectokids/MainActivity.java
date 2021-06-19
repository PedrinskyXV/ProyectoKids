package com.example.proyectokids;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

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

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher_book_round);

        cienciasImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Ciencias", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        socialesImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Sociales", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        mateImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Matematica", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent = new Intent(getApplicationContext(), pregunta_mate_1.class);
                startActivity(intent);
            }
        });
        lenguaImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Lenguaje", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FloatingActionButton fab = findViewById(R.id.integrantes);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Integrantes del grupo", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent = new Intent(getApplicationContext(), integrantes.class);
                startActivity(intent);
            }
        });
    }
}