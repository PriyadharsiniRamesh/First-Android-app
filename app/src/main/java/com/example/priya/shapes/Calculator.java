package com.example.priya.shapes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b_dec,b_add,b_sub,b_mul,b_div,b_clear,b_percent,b_equal;
    EditText val;
    Double v1,v2;
    boolean Addition , Subtract ,Multiplication ,Division, Percent ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        //this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        b1 = (Button)findViewById(R.id.button11);
        b2 = (Button)findViewById(R.id.button12);
        b3 = (Button)findViewById(R.id.button13);
        b4 = (Button)findViewById(R.id.button14);
        b5 = (Button)findViewById(R.id.button15);
        b6 = (Button)findViewById(R.id.button16);
        b7 = (Button)findViewById(R.id.button18);
        b8 = (Button)findViewById(R.id.button19);
        b9 = (Button)findViewById(R.id.button20);
        b0 = (Button)findViewById(R.id.button8);
        b_dec = (Button)findViewById(R.id.button9);
        b_add = (Button)findViewById(R.id.button22);
        b_sub = (Button)findViewById(R.id.button21);
        b_mul = (Button)findViewById(R.id.button17);
        b_div = (Button)findViewById(R.id.button10);
        b_equal = (Button)findViewById(R.id.button23);
        b_percent = (Button)findViewById(R.id.button24);
        b_clear = (Button)findViewById(R.id.button25);
        val = (EditText) findViewById(R.id.editText5);
        //final double num = 0;
        //b1.setOnClickListener(AdapterView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                val.setText(num + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                val.setText(num + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                val.setText(num + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                val.setText(num + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                val.setText(num + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                val.setText(num + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                val.setText(num + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                val.setText(num + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                val.setText(num + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                val.setText(num + "0");
            }
        });
        b_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                val.setText(num + ".");
            }
        });
        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                v1 = Double.parseDouble(num);
                if (val == null){
                    val.setText("");
                }
                else {
                    Addition = true;
                    val.setText(null);
                }
            }
        });
        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                v1 = Double.parseDouble(num);
                if (val == null){
                    val.setText("");
                }
                else {
                    Subtract = true;
                    val.setText(null);
                }
            }
        });
        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                v1 = Double.parseDouble(num);
                if (val == null){
                    val.setText("");
                }
                else {
                    Division = true;
                    val.setText(null);
                }
            }
        });
        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                v1 = Double.parseDouble(num);
                if (val == null){
                    val.setText("");
                }
                else {
                    Multiplication = true;
                    val.setText(null);
                }
            }
        });
        b_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = String.valueOf(val.getText());
                v1 = Double.parseDouble(num);
                if (val == null){
                    val.setText("");
                }
                else {
                    val.setText( v1 / 100 + "");
                }
            }
        });
        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val.setText("");
            }
        });
        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = String.valueOf(val.getText());
                v2 = Double.parseDouble(num);

                if (Addition == true){
                    val.setText(v1 + v2 +"");
                    Addition=false;
                }
                if (Subtract == true){
                    val.setText(v1 - v2 +"");
                    Subtract=false;
                }
                if (Multiplication == true){
                    val.setText(v1 * v2 +"");
                    Multiplication=false;
                }
                if (Division == true){
                    val.setText(v1 / v2 +"");
                    Division=false;
                }
            }
        });

    }
}
