package com.example.lab_10_9_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button bn1,bn2,bn3,bn4;
    TextView tv;
    String num1 ,num2;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 =(EditText) findViewById(R.id.in_1);
        et2 =(EditText) findViewById(R.id.in_2);
        bn1 =(Button) findViewById(R.id.button_1);
        bn2 =(Button) findViewById(R.id.button_2);
        bn3 =(Button) findViewById(R.id.button_3);
        bn4 =(Button) findViewById(R.id.button_4);
        tv  =(TextView) findViewById(R.id.textView);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    num1 = et1.getText().toString();
                    num2 = et2.getText().toString();
                    result = Integer.parseInt(num1)+Integer.parseInt(num2);
                    tv.setText(Integer.toString(result));

            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                result = Integer.parseInt(num1)-Integer.parseInt(num2);
                tv.setText(Integer.toString(result));

            }
        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                result = Integer.parseInt(num1)*Integer.parseInt(num2);
                tv.setText(Integer.toString(result));

            }
        });
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                if(Integer.parseInt(num1)<=Integer.parseInt(num2)){
                    result = Integer.parseInt(num2)/Integer.parseInt(num1);
                }else{
                    result = Integer.parseInt(num1)/Integer.parseInt(num2);
                }

                tv.setText(Integer.toString(result));

            }
        });
    }
}