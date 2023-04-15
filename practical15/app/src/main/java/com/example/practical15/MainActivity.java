package com.example.practical15;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText id,task;
    Button insert,view,update,delete;
    TextView text;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=(EditText)findViewById(R.id.id);
        task=(EditText)findViewById((R.id.task));
        insert=(Button)findViewById(R.id.insert);
        view=(Button)findViewById(R.id.view);
        update=(Button)findViewById(R.id.update);
        delete=(Button)findViewById(R.id.delete);
        text=(TextView)findViewById(R.id.text);
        db=new DatabaseHelper(getApplicationContext());
    }
    public void buttonAction(View view){
        switch (view.getId()){
            case R.id.insert:
                db.insertRecord(task.getText().toString());
                Toast.makeText(getApplicationContext(),"record inserted",Toast.LENGTH_LONG).show();
                break;
            case R.id.view:
                text.setText(db.getRecords());
                break;
            case R.id.update:

                db.updateRecord(id.getText().toString(),task.getText().toString());
                Toast.makeText(getApplicationContext(),"record updated",Toast.LENGTH_LONG).show();
                break;
            case R.id.delete:
                db.deleteRecord(id.getText().toString());
                Toast.makeText(getApplicationContext(),"record deleted",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
