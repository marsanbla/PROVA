package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginbtnn(View view) {
        Log.d(LOG_TAG, "Clicked");
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void signup(View view) {
        Log.d(LOG_TAG, "Clicked");
        Intent intent = new Intent(this, Signup.class);
        startActivity(intent);
    }
}