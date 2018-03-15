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

public class Two_d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_d);
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        final TextView textview3=(TextView)findViewById(R.id.textView3);
        final TextView textview4=(TextView)findViewById(R.id.textView4);
        final TextView textview5=(TextView)findViewById(R.id.textView5);
       final EditText val1=(EditText)findViewById(R.id.editText);
        val1.setVisibility(View.INVISIBLE);

        final EditText val2=(EditText)findViewById(R.id.editText2);
        final EditText val3=(EditText)findViewById(R.id.editText3);
       final Button b1=(Button)findViewById(R.id.btn_area);
        final Button b2=(Button)findViewById(R.id.btn_peri);
        final TextView output=(TextView) findViewById(R.id.textView6);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                //String item =parent.getItemAtPosition(position).toString();
                //Toast.makeText(parent.getContext(),"selected:"+item,Toast.LENGTH_LONG).show();
                textview3.setVisibility(View.INVISIBLE);
                textview4.setVisibility(View.INVISIBLE);
                textview5.setVisibility(View.INVISIBLE);
                val1.setVisibility(View.INVISIBLE);
                val2.setVisibility(View.INVISIBLE);
                val3.setVisibility(View.INVISIBLE);
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                output.setVisibility(View.INVISIBLE);
                if(position==1) {
                    val1.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    output.setVisibility(View.VISIBLE);
                    textview3.setVisibility(View.VISIBLE);
                    textview3.setText("Side");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            square s=new square(n1);
                            Double area = s.s_area();
                            output.setText("The Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            square s=new square(n1);
                            Double cir = s.s_peri();
                            output.setText("The Perimeter is" + cir);
                        }
                    });
                }
                else if(position==2) {
                    val1.setVisibility(View.VISIBLE);
                    val2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    output.setVisibility(View.VISIBLE);
                    textview3.setVisibility(View.VISIBLE);
                    textview4.setVisibility(View.VISIBLE);
                    textview3.setText("Length");
                    textview4.setText("Breadth");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            rectangle r=new rectangle(n1,n2);
                            Double area = r.r_area();
                            output.setText("The Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            rectangle r=new rectangle(n1,n2);
                            Double cir = r.r_peri();
                            output.setText("The Perimeter is" + cir);
                        }
                    });
                }

                else if(position==3){
                    val1.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    output.setVisibility(View.VISIBLE);
                    textview3.setVisibility(View.VISIBLE);
                    textview3.setText("Radius");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            circle c=new circle(n1);
                            Double area=c.c_area();
                            output.setText("The Area is"+area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            circle c=new circle(n1);
                            Double cir=c.c_peri();
                            output.setText("The Circumference is"+cir);
                        }
                    });
                }
                else if(position==4) {
                    val1.setVisibility(View.VISIBLE);
                    val2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    output.setVisibility(View.VISIBLE);
                    textview3.setVisibility(View.VISIBLE);
                    textview4.setVisibility(View.VISIBLE);
                    textview3.setText("Base");
                    textview4.setText("Height");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            parallelogram p=new parallelogram(n1,n2);
                            Double area = p.p_area();
                            output.setText("The Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            parallelogram p=new parallelogram(n1,n2);
                            Double cir = p.p_peri();
                            output.setText("The Perimeter is" + cir);
                        }
                    });
                }
                else if(position==5) {
                    val1.setVisibility(View.VISIBLE);
                    val2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    output.setVisibility(View.VISIBLE);
                    textview3.setVisibility(View.VISIBLE);
                    textview4.setVisibility(View.VISIBLE);
                    textview3.setText("Side");
                    textview4.setText("Height");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            hexagon h= new hexagon(n1,n2);
                            Double area = h.h_area();
                            output.setText("The Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            hexagon h= new hexagon(n1,n2);
                            Double cir = h.h_peri();
                            output.setText("The Perimeter is" + cir);
                        }
                    });
                }
                else if(position==6) {
                    val1.setVisibility(View.VISIBLE);
                    val2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    output.setVisibility(View.VISIBLE);
                    textview3.setVisibility(View.VISIBLE);
                    textview4.setVisibility(View.VISIBLE);
                    textview3.setText("Side");
                    textview4.setText("Height");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            pentagon p= new pentagon(n1,n2);
                            Double area = p.p_area();
                            output.setText("The Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            pentagon p= new pentagon(n1,n2);
                            Double cir = p.p_area();
                            output.setText("The Perimeter is" + cir);
                        }
                    });
                }
                else if(position==7) {
                    val1.setVisibility(View.VISIBLE);
                    val2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    output.setVisibility(View.VISIBLE);
                    textview3.setVisibility(View.VISIBLE);
                    textview4.setVisibility(View.VISIBLE);
                    textview3.setText("side");
                    textview4.setText("Height");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            octagon o=new octagon(n1,n2);
                            Double area = o.o_area();
                            output.setText("The Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            octagon o=new octagon(n1,n2);
                            Double cir = o.o_peri();
                            output.setText("The Perimeter is" + cir);
                        }
                    });
                }
                else if(position==8) {
                    val1.setVisibility(View.VISIBLE);
                    val2.setVisibility(View.VISIBLE);
                    val3.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    output.setVisibility(View.VISIBLE);
                    textview3.setVisibility(View.VISIBLE);
                    textview4.setVisibility(View.VISIBLE);
                    textview5.setVisibility(View.VISIBLE);
                    textview3.setText("Length");
                    textview4.setText("Breadth");
                    textview5.setText("Height");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            Double n3 =val3.getText().toString().equals("")?0.0:Double.valueOf(val3.getText().toString());
                            triangle t=new triangle(n1,n2,n3);
                            Double area= t.t_area();
                            output.setText("The Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            Double n3 =val3.getText().toString().equals("")?0.0:Double.valueOf(val3.getText().toString());
                            triangle t=new triangle(n1,n2,n3);
                            Double cir = t.t_peri();
                            output.setText("The Perimeter is" + cir);
                        }
                    });
                }
                else if(position==9) {
                    val1.setVisibility(View.VISIBLE);
                    val2.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    b2.setVisibility(View.VISIBLE);
                    output.setVisibility(View.VISIBLE);
                    textview3.setVisibility(View.VISIBLE);
                    textview4.setVisibility(View.VISIBLE);
                    textview3.setText("Radius1");
                    textview4.setText("Radius2");
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 =val1.getText().toString().equals("")?0.0:Double.valueOf(val1.getText().toString());
                            Double n2 =val2.getText().toString().equals("")?0.0:Double.valueOf(val2.getText().toString());
                            ellipse e=new ellipse(n1,n2);
                            Double area = e.e_area();
                            output.setText("The Area is" + area);
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Double n1 = Double.valueOf(val1.getText().toString());
                            Double n2 = Double.valueOf(val2.getText().toString());
                            ellipse e=new ellipse(n1,n2);
                            Double cir = e.e_peri();
                            output.setText("The Perimeter is" + cir);
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
        shapes.add("Square");
        shapes.add("Rectangle");
        shapes.add("Circle");
        shapes.add("Parallelogram");
        shapes.add("Hexagon");
        shapes.add("Pentagon");
        shapes.add("Octagon");
        shapes.add("Triangle");
        shapes.add("Ellipse");
        ArrayAdapter<String> data_adaptor=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,shapes);
        data_adaptor.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(data_adaptor);
    }
}

