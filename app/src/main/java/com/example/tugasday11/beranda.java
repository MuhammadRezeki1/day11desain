package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class beranda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_beranda);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton koinbtn = findViewById(R.id.tvKoin);
        koinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beranda.this, koin.class);
                startActivity(intent);
            }
        });

        ImageButton dana = findViewById(R.id.tvDana);
        dana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beranda.this, dana.class);
                startActivity(intent);
            }
        });

        ImageButton live = findViewById(R.id.tvLive);
        live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(beranda.this,live.class);
                startActivity(inten);
            }
        });

        ImageButton pulsa = findViewById(R.id.pulsa);
        pulsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beranda.this,pulsa.class);
                startActivity(intent);
            }
        });

        ImageButton free = findViewById(R.id.free);
        free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beranda.this,free.class);
                startActivity(intent);
            }
        });

        ImageButton mall = findViewById(R.id.tvmall);
        mall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beranda.this,mall.class);
                startActivity(intent);
            }
        });
    }
}