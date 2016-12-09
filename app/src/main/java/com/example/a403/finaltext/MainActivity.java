package com.example.a403.finaltext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    Button bt1,bt2,bt3;
    RadioGroup rbg1,rbg2;
    RadioButton rb1,rb2,rb3,rb4,rb5;
    ImageView img1;
    EditText et1,et2,et3;
    TimePicker tp1;
    CalendarView cv1;
    Chronometer ch1;
    Switch sw1;
    LinearLayout l1,l2,l3,l4,l5,l6





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView4);
        t5=(TextView)findViewById(R.id.textView5);
        t6=(TextView)findViewById(R.id.textView6);
        t7=(TextView)findViewById(R.id.textView7);
        t8=(TextView)findViewById(R.id.textView8);
        bt1=(Button)findViewById(R.id.button5);
        bt2=(Button)findViewById(R.id.button6);
        bt3=(Button)findViewById(R.id.button9);
        rbg1=(RadioGroup)findViewById(R.id.rbg1);
        rbg2=(RadioGroup)findViewById(R.id.rbg2);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        rb5=(RadioButton)findViewById(R.id.radioButton5);
        img1=(ImageView)findViewById(R.id.imageView3);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        tp1=(TimePicker)findViewById(R.id.timePicker2);
        cv1=(CalendarView)findViewById(R.id.calendarView2);
        ch1=(Chronometer)findViewById(R.id.chronometer2);
        sw1=(Switch)findViewById(R.id.switch1);
        l1=(LinearLayout)findViewById(R.id.l1);
        l2=(LinearLayout)findViewById(R.id.l2);
        l3=(LinearLayout)findViewById(R.id.l3);
        l4=(LinearLayout)findViewById(R.id.l4);
        l5=(LinearLayout)findViewById(R.id.l5);
        l6=(LinearLayout)findViewById(R.id.l6);


        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    l1.setVisibility(View.VISIBLE);
                    ch1.start();
                } else {
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double price = 0;
                int pp = 0;
                String select = "";
                if (!et1.getText().toString().equals("")) {
                    int c = Integer.parseInt(et1.getText().toString());
                    pp += c;
                    price += c * 15000;
                }
                if (!et2.getText().toString().equals("")) {
                    int c = Integer.parseInt(et2.getText().toString());
                    pp += c;
                    price += c * 12000;
                }
                if (!et3.getText().toString().equals("")) {
                    int c = Integer.parseInt(et2.getText().toString());
                    pp += c;
                    price += c * 8000;
                }
            }
        });
        rbg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (rb1.isChecked()) {
                    double price = 0;
                    price = price * 0.5;
                    img1.setImageResource(R.drawable.t1);
                }
                if (rb2.isChecked()) {
                    double price = 0;
                    price = price * 10;
                    img1.setImageResource(R.drawable.t2);
                }
                if(rb3.isChecked()){
                    double price = 0;
                    price = price * 20;
                    img1.setImageResource(R.drawable.t3);
                }
            }

        });



    }
}






