package com.dev3.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;

public class MainActivity2 extends AppCompatActivity {
Switch sh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sh = findViewById(R.id.switch1);
        sh.setBackgroundColor(130);
    }
}