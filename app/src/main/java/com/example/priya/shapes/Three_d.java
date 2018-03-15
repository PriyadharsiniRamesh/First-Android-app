package com.example.priya.shapes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Three_d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_d);

        final EditText val1=(EditText)findViewById(R.id.editText);
        final EditText val2=(EditText)findViewById(R.id.editText2);
        final EditText val3=(EditText)findViewById(R.id.editText3);
        final Button b1=(Button)findViewById(R.id.btn_area);
        final Button b2=(Button)findViewById(R.id.btn_peri);
        final TextView textview1=(TextView)findViewById(R.id.textView3);
        final TextView textview2=(TextView)findViewById(R.id.textView4);
        final TextView textview3=(TextView)findViewById(R.id.textView5);
        final TextView out=(TextView) findViewById(R.id.textView6);
        Spinner spin=(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                val1.setVisibility(View.INVISIBLE);
                val2.setVisibility(View.INVISIBLE);
                val3.setVisibility(View.INVISIBLE);
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                out.setVisibility(View.INVISIBLE);
                textview1.setVisibility(View.INVISIBLE);
                textview2.setVisibility(View.INVISIBLE);
                textview3.setVisibility(View.INVISIBLE);
                if(position==1) {
                    val1.setVisibility(View.VISIBLE);
                    val2.setVisibility(View.VISIBLE);
                    val3.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    out.setVisibility(View.VISIBLE);
                    textview1.setVisibility(View.VISIBLE);
                    textview2.setVisibility(View.VISIBLE);
                    textview3.setVisibility(View.VISIBLE);
                    textview1.setText("Length");
                    textview2.setText("Breadth");
                    textview3.setText("Height");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            Double n3 =val3.getText().toString().equals("")?0.0:Double.valueOf(val3.getText().toString());
                            cuboid  c= new cuboid(n1,n2,n3);
                            Double area=c.c_area();
                            out.setText("The Surface Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            Double n3 =val3.getText().toString().equals("")?0.0:Double.valueOf(val3.getText().toString());
                            cuboid  c= new cuboid(n1,n2,n3);
                            Double cir=c.c_vol();
                            out.setText("The volume is" + cir);
                        }
                    });
                }
                else if(position==2) {
                    val1.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    out.setVisibility(View.VISIBLE);
                    textview1.setVisibility(View.VISIBLE);
                    textview1.setText("Side");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            cube c= new cube(n1);
                            Double area = c.c_area();
                            out.setText("The Surface Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            cube c= new cube(n1);
                            Double cir = c.c_vol();
                            out.setText("The Volume is" + cir);
                        }
                    });
                }
                else if(position==3) {
                    val1.setVisibility(View.VISIBLE);
                    val2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    out.setVisibility(View.VISIBLE);
                    textview1.setVisibility(View.VISIBLE);
                    textview2.setVisibility(View.VISIBLE);
                    textview1.setText("Radius");
                    textview2.setText("Height");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            cone c= new cone(n1,n2);
                            Double area=c.c_area();
                            out.setText("The Surface Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            cone c= new cone(n1,n2);
                            Double cir=c.c_vol();
                            out.setText("The volume is" + cir);
                        }
                    });
                }
                else if(position==4) {
                    val1.setVisibility(View.VISIBLE);
                    val2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    out.setVisibility(View.VISIBLE);
                    textview1.setVisibility(View.VISIBLE);
                    textview2.setVisibility(View.VISIBLE);
                    textview1.setText("Radius");
                    textview2.setText("Height");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            cylinder c= new cylinder(n1,n2);
                            Double area=c.c_area();
                            out.setText("The Surface Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            cylinder c = new cylinder(n1,n2);
                            Double cir=c.c_vol();
                            out.setText("The volume is" + cir);
                        }
                    });
                }
                else if(position==5) {
                    val1.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    out.setVisibility(View.VISIBLE);
                    textview1.setVisibility(View.VISIBLE);
                    textview1.setText("Radius");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            sphere s = new sphere(n1);
                            Double area = s.s_area();
                            out.setText("The Surface Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            sphere s= new sphere(n1);
                            Double cir = s.s_vol();
                            out.setText("The Volume is" + cir);
                        }
                    });
                }
                else if(position==6) {
                    val1.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    out.setVisibility(View.VISIBLE);
                    textview1.setVisibility(View.VISIBLE);
                    textview1.setText("Radius");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            hemisphere s = new hemisphere(n1);
                            Double area = s.h_area();
                            out.setText("The Surface Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            hemisphere s= new hemisphere(n1);
                            Double cir = s.h_vol();
                            out.setText("The Volume is" + cir);
                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        List<String> shapes=new ArrayList<String>();
        shapes.add("Select Shape");
        shapes.add("Cuboid");
        shapes.add("Cube");
        shapes.add("Cone");
        shapes.add("Cylinder");
        shapes.add("Sphere");
        shapes.add("Hemisphere");
        ArrayAdapter<String> data_adaptor=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,shapes);
        data_adaptor.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spin.setAdapter(data_adaptor);
    }


}


