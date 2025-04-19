package com.example.flashcardapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast; //

import androidx.appcompat.app.AppCompatActivity;

public class TopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        Button btnAnimal = findViewById(R.id.btnAnimal);
        Button btnFamily = findViewById(R.id.unit2Card);  // Chỉ gọi 1 lần thôi
        Button btnFood = findViewById(R.id.btnFood);

        btnAnimal.setOnClickListener(v -> {
            Toast.makeText(this, "Bạn chọn Animal", Toast.LENGTH_SHORT).show();
        });

        btnFamily.setOnClickListener(v -> {
            Toast.makeText(this, "Bạn chọn Family", Toast.LENGTH_SHORT).show();
            // Chuyển sang FlashcardActivity
            Intent intent = new Intent(TopicActivity.this, FlashcardActivity.class);
            startActivity(intent);
        });

        btnFood.setOnClickListener(v -> {
            Toast.makeText(this, "Bạn chọn Food", Toast.LENGTH_SHORT).show();
        });
    }
}
