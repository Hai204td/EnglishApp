package com.example.english5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());


        TextView txtResult = findViewById(R.id.txtResult);
        Button btnNext = findViewById(R.id.btnNext);


        boolean isCorrect = getIntent().getBooleanExtra("isCorrect", false);
        if (isCorrect) {
            txtResult.setText("Chính xác!");
            txtResult.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        } else {
            txtResult.setText("Sai rồi!");
            txtResult.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
        }

        btnNext.setOnClickListener(v -> {
            // TODO: Chuyển sang câu tiếp theo
            finish();
        });
    }
}
