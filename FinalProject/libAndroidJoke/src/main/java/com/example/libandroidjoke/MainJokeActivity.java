package com.example.libandroidjoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.libjavajoke.JavaJoke;

public class MainJokeActivity extends AppCompatActivity {

    TextView joke;
    String jokeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joke);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        joke = findViewById(R.id.tv_main_joke_text);
        jokeString = getIntent().getStringExtra("JOKE");
        joke.setText(jokeString);
    }
}
