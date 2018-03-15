package com.example.priya.shapes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Start_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        ImageButton shapes_btn=(ImageButton)findViewById(R.id.imageButton2);
        ImageButton convert_btn=(ImageButton)findViewById(R.id.imageButton3);
        ImageButton calc_btn=(ImageButton)findViewById(R.id.imageButton4);

        shapes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Start_page.this, Shapes.class);
                startActivity(intent1);
            }
        });
        convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(Start_page.this, Conversion.class);
                startActivity(inten);
            }
        });
        calc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(Start_page.this, Calculator.class);
                startActivity(inten);
            }
        });
    }
    }
