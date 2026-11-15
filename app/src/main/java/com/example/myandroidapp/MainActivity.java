package com.example.myandroidapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Xin chao! Ung dung build tu GitHub thanh cong!");
        tv.setTextSize(22);
        tv.setPadding(50, 100, 50, 50);
        setContentView(tv);
    }
}
