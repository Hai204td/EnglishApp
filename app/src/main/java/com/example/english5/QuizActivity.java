package com.example.flashcardapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        RadioGroup answerGroup = findViewById(R.id.answerGroup);
        RadioButton answerA = findViewById(R.id.answerA);
        TextView txtResult = findViewById(R.id.txtResult);
        Button btnNext = findViewById(R.id.btnNext);
        Button btnCheck = findViewById(R.id.btnCheck);

        btnCheck.setOnClickListener(v -> {
            int selectedId = answerGroup.getCheckedRadioButtonId();

            if (selectedId == -1) {
                Toast.makeText(this, "Hãy chọn 1 đáp án", Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton selectedButton = findViewById(selectedId);
            String selectedText = selectedButton.getText().toString();

            if (selectedText.contains("Mẹ")) {
                txtResult.setText("Chính xác!");
                txtResult.setTextColor(Color.parseColor("#388E3C")); // xanh
                txtResult.setBackgroundColor(Color.parseColor("#DDF6DD")); // nền xanh nhạt
            } else {
                txtResult.setText("Sai rồi!");
                txtResult.setTextColor(Color.RED);
                txtResult.setBackgroundColor(Color.parseColor("#FFEBEE"));
            }

            txtResult.setVisibility(View.VISIBLE);
            btnNext.setVisibility(View.VISIBLE);
        });

        btnNext.setOnClickListener(v -> {
            // TODO: Chuyển sang câu tiếp theo hoặc trang kết quả
            Toast.makeText(this, "Chuyển sang câu tiếp theo...", Toast.LENGTH_SHORT).show();
        });
    }
}
