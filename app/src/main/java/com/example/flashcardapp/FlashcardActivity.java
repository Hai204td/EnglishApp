package com.example.flashcardapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;


public class FlashcardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard);
        TextView quizLink = findViewById(R.id.quizLink);
        quizLink.setOnClickListener(v -> {
            Intent intent = new Intent(FlashcardActivity.this, QuizActivity.class);
            startActivity(intent);
        });

    }
}
