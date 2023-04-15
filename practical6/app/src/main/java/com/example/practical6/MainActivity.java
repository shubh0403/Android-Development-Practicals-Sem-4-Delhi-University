package com.example.practical6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listView);
        TextView textView = (TextView) findViewById(R.id.txtView);
        String[] listItem = {"BSc", "BCom", "BA"};
        final ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                listItem);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int
                    position, long l) {

                String value = adapter.getItem(position);
                Log.v("value", value);
                String teacher = "";
                if (value.equals("BSc")) {
                    teacher = "abc";
                } else if (value.equals("BCom")) {
                    teacher = "pqr";
                } else if (value.equals("BA")) teacher = "ghj";
                Toast.makeText(getApplicationContext(), teacher, Toast.LENGTH_SHORT).show();
            }
        });
    }
}