package com.fishnco.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {

    private TextView textView_receivedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        textView_receivedText = findViewById(R.id.textView_receivedText);

        if (getIntent().getStringExtra("guess") != null) {
            String value = getIntent().getStringExtra("guess");
            textView_receivedText.setText(value);
        }

    }
}