package com.example.drakorlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailDrakorActivity extends AppCompatActivity {
    TextView txtName, txtGenre, txtSinopsis;
    String name, genre, sinopsis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_drakor);
        txtName = findViewById(R.id.txt_name);
        txtGenre = findViewById(R.id.txt_genre);
        txtSinopsis = findViewById(R.id.txt_sinopsis);

        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        genre = intent.getStringExtra("genre");
        sinopsis = intent.getStringExtra("sinopsis");

        txtName.setText(name);
        txtGenre.setText("Genre: " +genre);
        txtSinopsis.setText(sinopsis);
    }
}