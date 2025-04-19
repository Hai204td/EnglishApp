package com.example.english5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());


        Button btnVocabulary = findViewById(R.id.btnVocabulary);
        btnVocabulary.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, TopicActivity.class);
            startActivity(intent);
        });

        BottomNavigationView navView = findViewById(R.id.bottom_navigation);
        navView.setSelectedItemId(R.id.menu_home);

        navView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.menu_progress) {
                startActivity(new Intent(this, ProgressActivity.class));
                return true;
            } else if (item.getItemId() == R.id.menu_notification) {
                startActivity(new Intent(this, NotificationActivity.class));
                return true;
            } else if (item.getItemId() == R.id.menu_home) {
                return true;
            } else if (item.getItemId() == R.id.menu_profile) {
                Toast.makeText(this, "Trang cá nhân (chưa làm)", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        });
    }
}
