package com.example.Lavishgolfclubs;

import static com.example.Lavishgolfclubs.R.id.imageonly;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class image extends AppCompatActivity {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        int imageID = getIntent().getExtras().getInt("imageonly");
        img = (ImageView) findViewById(imageonly);
        img.setImageResource(imageID);
    }
}
