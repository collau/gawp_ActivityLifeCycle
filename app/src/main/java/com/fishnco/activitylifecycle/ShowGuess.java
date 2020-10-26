package com.fishnco.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {

    private TextView textView_receivedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        Bundle extra = getIntent().getExtras();

        textView_receivedText = findViewById(R.id.textView_receivedText);

        if (extra != null) {
            textView_receivedText.setText(extra.getString("guess"));
            Log.d("ShowGuess", Integer.toString(extra.getInt("age")));
        }

//        if (getIntent().getStringExtra("guess") != null) {
//            String value = getIntent().getStringExtra("guess");
//            textView_receivedText.setText(value);
//        }

    }
}