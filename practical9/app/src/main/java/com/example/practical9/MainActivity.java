package com.example.practical9;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textview);
        tv2 = (TextView) findViewById(R.id.textview2);
        tv3 = (TextView) findViewById(R.id.textview3);
        LinearLayout ll = (LinearLayout) findViewById(R.id.main_layout);
        RadioGroup rg = (RadioGroup) findViewById(R.id.bg_radiogroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton checkedRadioButton = (RadioButton) radioGroup.findViewById(checkedId);
                boolean isChecked = checkedRadioButton.isChecked();
                if (isChecked) {
                    switch (checkedRadioButton.getId()) {
                        case R.id.radioButton1:

                            ll.setBackgroundColor(getResources().getColor(R.color.purple_500));
                            break;
                        case R.id.radioButton2:

                            ll.setBackgroundColor(getResources().getColor(R.color.teal_200));
                            break;
                        case R.id.radioButton3:

                            ll.setBackgroundColor(getResources().getColor(R.color.yellow));
                            break;
                        case R.id.radioButton4:

                            ll.setBackgroundColor(getResources().getColor(R.color.green));
                            break;
                        case R.id.radioButton5:

                            ll.setBackgroundColor(getResources().getColor(R.color.Red));
                            break;
                    }
                }
            }
        });

        RadioGroup rg2 = (RadioGroup) findViewById(R.id.fg_radiogroup);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton checkedRadioButton = (RadioButton) radioGroup.findViewById(checkedId);
                boolean isChecked = checkedRadioButton.isChecked();
                if (isChecked) {
                    switch (checkedRadioButton.getId()) {
                        case R.id.rb1:
                            tv1.setTextColor(getResources().getColor(R.color.green));
                            tv2.setTextColor(getResources().getColor(R.color.green));

                            tv3.setTextColor(getResources().getColor(R.color.green));
                            break;
                        case R.id.rb2:

                            tv1.setTextColor(getResources().getColor(R.color.purple_700));
                            tv2.setTextColor(getResources().getColor(R.color.purple_700));
                            tv3.setTextColor(getResources().getColor(R.color.purple_700));
                            break;
                        case R.id.rb3:
                            tv1.setTextColor(getResources().getColor(R.color.yellow));
                            tv2.setTextColor(getResources().getColor(R.color.yellow));
                            tv3.setTextColor(getResources().getColor(R.color.yellow));
                            break;
                        case R.id.rb4:

                            tv1.setTextColor(getResources().getColor(R.color.white));
                            tv2.setTextColor(getResources().getColor(R.color.white));
                            tv3.setTextColor(getResources().getColor(R.color.white));
                            break;
                        case R.id.rb5:

                            tv1.setTextColor(getResources().getColor(R.color.Red));
                            tv2.setTextColor(getResources().getColor(R.color.Red));
                            tv3.setTextColor(getResources().getColor(R.color.Red));
                            break;
                    }
                }
            }
        });
    }
}
