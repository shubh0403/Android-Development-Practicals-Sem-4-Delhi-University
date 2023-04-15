package com.example.practical12_broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter("com.practical12.myBroadcastMessage");
        MyBroadcastReceiver objReceiver = new MyBroadcastReceiver();
        registerReceiver(objReceiver,intentFilter);
    }
}