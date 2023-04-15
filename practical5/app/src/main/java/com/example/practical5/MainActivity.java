package com.example.practical5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.mytv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id1:
                Toast.makeText(this, "Option1", Toast.LENGTH_SHORT).show();
                tv.setText("Option1");
                break;
            case R.id.id2:
                Toast.makeText(this, "Option2", Toast.LENGTH_SHORT).show();
                tv.setText("Option2");
                break;
            case R.id.id3:
                Toast.makeText(this, "Option3", Toast.LENGTH_SHORT).show();
                tv.setText("Option3");
                break;
            case R.id.id4:
                Toast.makeText(this, "Option4", Toast.LENGTH_SHORT).show();
                tv.setText("Option4");
                break;
            case R.id.id5:
                Toast.makeText(this, "Option5", Toast.LENGTH_SHORT).show();
                tv.setText("Option5");
                break;
        }
        return true;
    }
}