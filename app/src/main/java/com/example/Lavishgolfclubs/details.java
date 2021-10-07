package com.example.Lavishgolfclubs;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class details extends AppCompatActivity {


    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        String name= getIntent().getExtras().getString("name");
        int d = getIntent().getExtras().getInt("details");
        int img = getIntent().getExtras().getInt("image");
        this.setTitle(name);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        image = (ImageView) findViewById(R.id.image);
        TextView text = (TextView) findViewById(R.id.text);
        image.setImageResource(img);
        text.setText(d);
        text.setTextSize(20f);
    }
}