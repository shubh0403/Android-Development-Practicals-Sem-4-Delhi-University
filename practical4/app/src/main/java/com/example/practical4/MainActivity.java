package com.example.practical4;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ImageView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text1 = (TextView) findViewById(R.id.text1);
        ImageView img1 = (ImageView) findViewById(R.id.img1);
        String[] city = {"delhi","mumbai","chennai","kolkata"};
        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> arrayadpt = new
                ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, city);
        spin.setAdapter(arrayadpt);
        spin.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View v, int
                    position,long id){
                text1.setText("Your selected city : "+ city[position]);
                if(position==0) {img1.setImageResource(R.drawable.delhi); }
                else if(position==1) {img1.setImageResource(R.drawable.mumbai); }
                else if(position==2) {img1.setImageResource(R.drawable.csk); }
                else if(position==3) {img1.setImageResource(R.drawable.kolkata); }
            }
            public void onNothingSelected(AdapterView<?> parent){
                text1.setText("");
            }
        });
    }
}
