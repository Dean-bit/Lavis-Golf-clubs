package com.example.Lavishgolfclubs;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;



public class SActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
