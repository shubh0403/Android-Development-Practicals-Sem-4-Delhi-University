package com.example.practical11;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Second_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button b11 = (Button) this.findViewById(R.id.button2);
        Intent k = new Intent(this, MainActivity.class);
        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        b11.setOnClickListener(v -> {
            ad.setTitle("Login App");
            ad.setMessage("Do you want to logout");
            ad.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface Dialog, int buttonID) {
                    startActivity(k);
                    return;
                }
            });
            ad.setPositiveButton("No", new
                    DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface Dialog, int buttonID) {
                            return;
                        }
                    });
            ad.show();
        });
    }
}
