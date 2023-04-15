package com.example.practical11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) this.findViewById(R.id.buttonSubmit);
//        Button b2= (Button) this.findViewById(R.id.buttonSub);.
//        Button b3= (Button) this.findViewById(R.id.buttonReset);
        EditText e1 = (EditText) findViewById(R.id.editLogin);
        EditText e2 = (EditText) findViewById(R.id.editPassword);
        Intent i = new Intent(this, Second_activity.class);
        b1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String text1 = e1.getText().toString();
                String text2 = e2.getText().toString();
                Log.v(text1, "login");
                Log.v(text2, "password");
                if (text1.equals("login") && text2.equals("password")) {

                    Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                } else {

                    Toast.makeText(MainActivity.this, "Unsuccessful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
