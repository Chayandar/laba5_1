package com.example.laba5_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView textViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewData = findViewById(R.id.textViewData);

        String firstName = getIntent().getStringExtra("firstName");
        String lastName = getIntent().getStringExtra("lastName");

        String data = "Имя: " + firstName + "\nФамилия: " + lastName;
        textViewData.setText(data);

        Button buttonGreeting1 = findViewById(R.id.buttonGreeting1);
        buttonGreeting1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnResult("Привет, " + firstName + " " + lastName + "!");
            }
        });

        Button buttonGreeting2 = findViewById(R.id.buttonGreeting2);
        buttonGreeting2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnResult(firstName + "! Ваша Фамилия - " + lastName + "!");
            }
        });

        Button buttonGreeting3 = findViewById(R.id.buttonGreeting3);
        buttonGreeting3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnResult(firstName + " " + lastName);
            }
        });
    }

    private void returnResult(String result) {
        Intent intent = new Intent();
        intent.putExtra("result", result);
        setResult(RESULT_OK, intent);
        finish();
    }
}

