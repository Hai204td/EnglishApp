package com.example.flashcardapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView wordCard = findViewById(R.id.wordCard);
        TextView quizLink = findViewById(R.id.quizLink); // 👉 thêm dòng này để tìm view

        final boolean[] isFront = {true};

        wordCard.setOnClickListener(v -> {
            if (isFront[0]) {
                wordCard.setText("Nghĩa: Mẹ\nVí dụ: My mother is a teacher");
                wordCard.setTextSize(18);
                wordCard.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                isFront[0] = false;
            } else {
                wordCard.setText("Mother");
                wordCard.setTextSize(20);
                wordCard.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                isFront[0] = true;
            }
        });


        quizLink.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, QuizActivity.class);
            startActivity(intent);
        });
    }
}
