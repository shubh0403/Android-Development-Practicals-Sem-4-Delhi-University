package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mytext;
    private int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytext = findViewById(R.id.quantity_text_view);
    }

    public void decrement(View view) {
        if (number != 0) {
            number -= 1;
        }
        DisplayOnText(number);
    }

    public void increment(View view) {
        number += 1;
        DisplayOnText(number);
    }

    public void reset(View view) {
        number = 0;
        DisplayOnText(number);
    }

    public void DisplayOnText(int num) {
        mytext.setText("" + num);
    }
}
