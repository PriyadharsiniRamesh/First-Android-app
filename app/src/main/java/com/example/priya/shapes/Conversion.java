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

import static com.example.priya.shapes.R.layout.support_simple_spinner_dropdown_item;


public class Conversion extends AppCompatActivity {
    final String con_type[] = {"Select type","Currency","Distance","Temperature","Weight"};
    final String temp_type[] = {"Celsius","Fahrenheit","Kelvin"};
    final String weight_type[] = {"Gram","Kilogram","Milligram","Pound","Ounce","Tonne"};
    final String dist_type[] = {"Centimeter","Kilometer","Meter","Millimeter","Feet","Inch","Mile"};
    final String curncy_type[] = {"US-Dollar","Euro","Rupee","Yen","Singapore-Dollar"};
    Spinner spinner1,spinner2,spinner3;
    EditText conv1;
    TextView conv2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        spinner1 = (Spinner) findViewById(R.id.sp2);
        spinner2 = (Spinner) findViewById(R.id.sp3);
        spinner3 = (Spinner) findViewById(R.id.sp4);
        conv1 = (EditText) findViewById(R.id.editText4);
        conv2 = (TextView) findViewById(R.id.textView7);
        btn = (Button) findViewById(R.id.button);

        ArrayAdapter<String> data_adaptor1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, con_type);
        data_adaptor1.setDropDownViewResource(support_simple_spinner_dropdown_item);
        spinner1.setAdapter(data_adaptor1);
        spinner2.setVisibility(View.INVISIBLE);
        spinner3.setVisibility(View.INVISIBLE);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinner2.setVisibility(View.VISIBLE);
                spinner3.setVisibility(View.VISIBLE);
                if (position == 3) {
                    ArrayAdapter<String> data_adaptor2 = new ArrayAdapter<String>(Conversion.this, support_simple_spinner_dropdown_item, temp_type);
                    data_adaptor2.setDropDownViewResource(support_simple_spinner_dropdown_item);
                    spinner2.setAdapter(data_adaptor2);
                    spinner3.setAdapter(data_adaptor2);

                } else if (position == 4) {
                    ArrayAdapter<String> data_adaptor3 = new ArrayAdapter<String>(Conversion.this, support_simple_spinner_dropdown_item, weight_type);
                    data_adaptor3.setDropDownViewResource(support_simple_spinner_dropdown_item);
                    spinner2.setAdapter(data_adaptor3);
                    spinner3.setAdapter(data_adaptor3);
                } else if (position == 2) {
                    ArrayAdapter<String> data_adaptor4 = new ArrayAdapter<String>(Conversion.this, support_simple_spinner_dropdown_item, dist_type);
                    data_adaptor4.setDropDownViewResource(support_simple_spinner_dropdown_item);
                    spinner2.setAdapter(data_adaptor4);
                    spinner3.setAdapter(data_adaptor4);
                } else if (position == 1) {
                    ArrayAdapter<String> data_adaptor5 = new ArrayAdapter<String>(Conversion.this, support_simple_spinner_dropdown_item, curncy_type);
                    data_adaptor5.setDropDownViewResource(support_simple_spinner_dropdown_item);
                    spinner2.setAdapter(data_adaptor5);
                    spinner3.setAdapter(data_adaptor5);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                spinner2.setVisibility(View.VISIBLE);
                spinner3.setVisibility(View.VISIBLE);
                String val1 = String.valueOf(spinner2.getSelectedItem());
                String val2 = String.valueOf(spinner3.getSelectedItem());
                //String from = conv1.getText();
                //Double v1 = Double.parseDouble(String.valueOf(from));

                if (!conv1.getText().toString().equals("")) {
                    Double v1 = Double.parseDouble(conv1.getText().toString());
                    Double ans;
                    //= Double.valueOf(0);
                    if (val1.equalsIgnoreCase(val2)) {
                        conv2.setText(v1.toString());
                    } else if (val1.equalsIgnoreCase("Celsius") && val2.equalsIgnoreCase("Fahrenheit")) {
                        cel c = new cel(v1);
                        ans = c.fahren();
                        conv2.setText(ans.toString());
                    } else if (val1.equalsIgnoreCase("Celsius") && val2.equalsIgnoreCase("Kelvin")) {
                        cel c = new cel(v1);
                        ans = c.kelvin();
                        conv2.setText(ans.toString());
                    } else if (val1.equalsIgnoreCase("Fahrenheit") && val2.equalsIgnoreCase("Celsius")) {
                        fah f = new fah(v1);
                        ans = f.celsius();
                        conv2.setText(ans.toString());
                    } else if (val1.equalsIgnoreCase("Fahrenheit") && val2.equalsIgnoreCase("Kelvin")) {
                        fah f = new fah(v1);
                        ans = f.kelvin();
                        conv2.setText(ans.toString());
                    } else if (val1.equalsIgnoreCase("Kelvin") && val2.equalsIgnoreCase("Celsius")) {
                        kel k = new kel(v1);
                        ans = k.celsius();
                        conv2.setText(ans.toString());
                    } else if (val1.equalsIgnoreCase("Kelvin") && val2.equalsIgnoreCase("Fahrenheit")) {
                        kel k = new kel(v1);
                        ans = k.fahren();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Meter") && val2.equalsIgnoreCase("Centimeter")) {
                        meter m = new meter(v1);
                        ans = m.centimeter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Meter") && val2.equalsIgnoreCase("Kilometer")) {
                        meter m = new meter(v1);
                        ans = m.kilometer();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Meter") && val2.equalsIgnoreCase("Feet")) {
                        meter m = new meter(v1);
                        ans = m.feet();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Meter") && val2.equalsIgnoreCase("Inch")) {
                        meter m = new meter(v1);
                        ans = m.inches();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Meter") && val2.equalsIgnoreCase("Millimeter")) {
                        meter m = new meter(v1);
                        ans = m.millimeter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Meter") && val2.equalsIgnoreCase("Mile")) {
                        meter m = new meter(v1);
                        ans = m.mile();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Millimeter") && val2.equalsIgnoreCase("Inch")) {
                        millimeter m = new millimeter(v1);
                        ans = m.inches();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Millimeter") && val2.equalsIgnoreCase("Meter")) {
                        millimeter m = new millimeter(v1);
                        ans = m.meter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Millimeter") && val2.equalsIgnoreCase("Feet")) {
                        millimeter m = new millimeter(v1);
                        ans = m.feet();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Millimeter") && val2.equalsIgnoreCase("Kilometer")) {
                        millimeter m = new millimeter(v1);
                        ans = m.kilometer();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Millimeter") && val2.equalsIgnoreCase("Mile")) {
                        millimeter m = new millimeter(v1);
                        ans = m.mile();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Millimeter") && val2.equalsIgnoreCase("Centimeter")) {
                        millimeter m = new millimeter(v1);
                        ans = m.centimeter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Centimeter") && val2.equalsIgnoreCase("Inch")) {
                        centimeter c = new centimeter(v1);
                        ans = c.inches();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Centimeter") && val2.equalsIgnoreCase("Meter")) {
                        centimeter c = new centimeter(v1);
                        ans = c.meter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Centimeter") && val2.equalsIgnoreCase("Millimeter")) {
                        centimeter c = new centimeter(v1);
                        ans = c.millimeter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Centimeter") && val2.equalsIgnoreCase("Kilometer")) {
                        centimeter c = new centimeter(v1);
                        ans = c.kilometer();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Centimeter") && val2.equalsIgnoreCase("Feet")) {
                        centimeter c = new centimeter(v1);
                        ans = c.feet();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Centimeter") && val2.equalsIgnoreCase("Mile")) {
                        centimeter c = new centimeter(v1);
                        ans = c.mile();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Kilometer") && val2.equalsIgnoreCase("Inch")) {
                        kilometer k = new kilometer(v1);
                        ans = k.inches();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Kilometer") && val2.equalsIgnoreCase("Meter")) {
                        kilometer k = new kilometer(v1);
                        ans = k.meter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Kilometer") && val2.equalsIgnoreCase("Millimeter")) {
                        kilometer k = new kilometer(v1);
                        ans = k.millimeter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Kilometer") && val2.equalsIgnoreCase("Centimeter")) {
                        kilometer k = new kilometer(v1);
                        ans = k.centimeter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Kilometer") && val2.equalsIgnoreCase("Mile")) {
                        kilometer k = new kilometer(v1);
                        ans = k.mile();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Kilometer") && val2.equalsIgnoreCase("Feet")) {
                        kilometer k = new kilometer(v1);
                        ans = k.feet();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Mile") && val2.equalsIgnoreCase("Inch")) {
                        mile m = new mile(v1);
                        ans = m.inches();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Mile") && val2.equalsIgnoreCase("Feet")) {
                        mile m = new mile(v1);
                        ans = m.feet();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Mile") && val2.equalsIgnoreCase("Meter")) {
                        mile m = new mile(v1);
                        ans = m.meter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Mile") && val2.equalsIgnoreCase("Millimeter")) {
                        mile m = new mile(v1);
                        ans = m.millimeter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Mile") && val2.equalsIgnoreCase("Centimeter")) {
                        mile m = new mile(v1);
                        ans = m.centimeter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Mile") && val2.equalsIgnoreCase("Kilometer")) {
                        mile m = new mile(v1);
                        ans = m.kilometer();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Feet") && val2.equalsIgnoreCase("Inch")) {
                        feet f = new feet(v1);
                        ans = f.inches();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Feet") && val2.equalsIgnoreCase("Meter")) {
                        feet f = new feet(v1);
                        ans = f.meter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Feet") && val2.equalsIgnoreCase("Millimeter")) {
                        feet f = new feet(v1);
                        ans = f.millimeter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Feet") && val2.equalsIgnoreCase("Centimeter")) {
                        feet f = new feet(v1);
                        ans = f.centimeter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Feet") && val2.equalsIgnoreCase("Kilometer")) {
                        feet f = new feet(v1);
                        ans = f.kilometer();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Feet") && val2.equalsIgnoreCase("Mile")) {
                        feet f = new feet(v1);
                        ans = f.mile();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Inch") && val2.equalsIgnoreCase("Meter")) {
                        inches i = new inches(v1);
                        ans = i.meter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Inch") && val2.equalsIgnoreCase("Foot")) {
                        inches i = new inches(v1);
                        ans = i.feet();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Inch") && val2.equalsIgnoreCase("Centimeter")) {
                        inches i = new inches(v1);
                        ans = i.centimeter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Inch") && val2.equalsIgnoreCase("Millimeter")) {
                        inches i = new inches(v1);
                        ans = i.millimeter();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Inch") && val2.equalsIgnoreCase("Kilometer")) {
                        inches i = new inches(v1);
                        ans = i.kilometer();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Inch") && val2.equalsIgnoreCase("Feet")) {
                        inches i = new inches(v1);
                        ans = i.feet();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("US-Dollar") && val2.equalsIgnoreCase("Rupee")) {
                        us_dollar u = new us_dollar(v1);
                        ans = u.rupees();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("US-Dollar") && val2.equalsIgnoreCase("Euro")) {
                        us_dollar u = new us_dollar(v1);
                        ans = u.euro();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("US-Dollar") && val2.equalsIgnoreCase("Yen")) {
                        us_dollar u = new us_dollar(v1);
                        ans = u.yen();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("US-Dollar") && val2.equalsIgnoreCase("Singapore-Dollar")) {
                        us_dollar u = new us_dollar(v1);
                        ans = u.sg_dollar();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Singapore-Dollar") && val2.equalsIgnoreCase("Rupee")) {
                        sg_dollar s = new sg_dollar(v1);
                        ans = s.rupees();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Singapore-Dollar") && val2.equalsIgnoreCase("Euro")) {
                        sg_dollar s = new sg_dollar(v1);
                        ans = s.euro();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Singapore-Dollar") && val2.equalsIgnoreCase("Yen")) {
                        sg_dollar s = new sg_dollar(v1);
                        ans = s.yen();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Singapore-Dollar") && val2.equalsIgnoreCase("US-Dollar")) {
                        sg_dollar s = new sg_dollar(v1);
                        ans = s.us_dollar();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Rupee") && val2.equalsIgnoreCase("US-Dollar")) {
                        rupees r = new rupees(v1);
                        ans = r.us_dollar();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Rupee") && val2.equalsIgnoreCase("Singapore-Dollar")) {
                        rupees r = new rupees(v1);
                        ans = r.sg_dollar();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Rupee") && val2.equalsIgnoreCase("Yen")) {
                        rupees r = new rupees(v1);
                        ans = r.yen();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Rupee") && val2.equalsIgnoreCase("Euro")) {
                        rupees r = new rupees(v1);
                        ans = r.euro();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Yen") && val2.equalsIgnoreCase("US-Dollar")) {
                        yen y = new yen(v1);
                        ans = y.us_dollar();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Yen") && val2.equalsIgnoreCase("Singapore-Dollar")) {
                        yen y = new yen(v1);
                        ans = y.sgd();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Yen") && val2.equalsIgnoreCase("Euro")) {
                        yen y = new yen(v1);
                        ans = y.euro();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Yen") && val2.equalsIgnoreCase("Rupee")) {
                        yen y = new yen(v1);
                        ans = y.rupees();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Euro") && val2.equalsIgnoreCase("US-Dollar")) {
                        euro e = new euro(v1);
                        ans = e.us_dollar();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Euro") && val2.equalsIgnoreCase("Singapore-Dollar")) {
                        euro e = new euro(v1);
                        ans = e.sg_dollar();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Euro") && val2.equalsIgnoreCase("Rupee")) {
                        euro e = new euro(v1);
                        ans = e.rupees();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Euro") && val2.equalsIgnoreCase("Yen")) {
                        euro e = new euro(v1);
                        ans = e.yen();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Gram") && val2.equalsIgnoreCase("Kilogram")) {
                        gram e = new gram(v1);
                        ans = e.kilogram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Gram") && val2.equalsIgnoreCase("Milligram")) {
                        gram e = new gram(v1);
                        ans = e.milligram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Gram") && val2.equalsIgnoreCase("Tonne")) {
                        gram e = new gram(v1);
                        ans = e.tonne();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Gram") && val2.equalsIgnoreCase("Ounce")) {
                        gram e = new gram(v1);
                        ans = e.ounce();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Gram") && val2.equalsIgnoreCase("Pound")) {
                        gram e = new gram(v1);
                        ans = e.pound();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Milligram") && val2.equalsIgnoreCase("Kilogram")) {
                        milligram m = new milligram(v1);
                        ans = m.kilogram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Milligram") && val2.equalsIgnoreCase("Gram")) {
                        milligram m = new milligram(v1);
                        ans = m.gram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Milligram") && val2.equalsIgnoreCase("Tonne")) {
                        milligram m = new milligram(v1);
                        ans = m.tonne();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Milligram") && val2.equalsIgnoreCase("Ounce")) {
                        milligram m = new milligram(v1);
                        ans = m.ounce();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Milligram") && val2.equalsIgnoreCase("Pound")) {
                        milligram m = new milligram(v1);
                        ans = m.pound();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Kilogram") && val2.equalsIgnoreCase("Milligram")) {
                        kilogram k = new kilogram(v1);
                        ans = k.milligram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Kilogram") && val2.equalsIgnoreCase("Gram")) {
                        kilogram k = new kilogram(v1);
                        ans = k.gram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Kilogram") && val2.equalsIgnoreCase("Pound")) {
                        kilogram k = new kilogram(v1);
                        ans = k.pound();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Kilogram") && val2.equalsIgnoreCase("Ounce")) {
                        kilogram k = new kilogram(v1);
                        ans = k.ounce();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Kilogram") && val2.equalsIgnoreCase("Tonne")) {
                        kilogram k = new kilogram(v1);
                        ans = k.tonne();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Tonne") && val2.equalsIgnoreCase("Milligram")) {
                        tonne t = new tonne(v1);
                        ans = t.milligram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Tonne") && val2.equalsIgnoreCase("Kilogram")) {
                        tonne t = new tonne(v1);
                        ans = t.kilogram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Tonne") && val2.equalsIgnoreCase("Gram")) {
                        tonne t = new tonne(v1);
                        ans = t.gram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Tonne") && val2.equalsIgnoreCase("Pound")) {
                        tonne t = new tonne(v1);
                        ans = t.pound();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Tonne") && val2.equalsIgnoreCase("Ounce")) {
                        tonne t = new tonne(v1);
                        ans = t.ounce();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Ounce") && val2.equalsIgnoreCase("Milligram")) {
                        ounce o = new ounce(v1);
                        ans = o.milligram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Ounce") && val2.equalsIgnoreCase("Kilogram")) {
                        ounce o = new ounce(v1);
                        ans = o.kilogram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Ounce") && val2.equalsIgnoreCase("Gram")) {
                        ounce o = new ounce(v1);
                        ans = o.gram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Ounce") && val2.equalsIgnoreCase("Pound")) {
                        ounce o = new ounce(v1);
                        ans = o.pound();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Ounce") && val2.equalsIgnoreCase("Tonne")) {
                        ounce o = new ounce(v1);
                        ans = o.tonne();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Pound") && val2.equalsIgnoreCase("Gram")) {
                        pound p = new pound(v1);
                        ans = p.gram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Pound") && val2.equalsIgnoreCase("Milligram")) {
                        pound p = new pound(v1);
                        ans = p.milligram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Pound") && val2.equalsIgnoreCase("Kilogram")) {
                        pound p = new pound(v1);
                        ans = p.kilogram();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Pound") && val2.equalsIgnoreCase("Ounce")) {
                        pound p = new pound(v1);
                        ans = p.ounce();
                        conv2.setText(ans.toString());
                    }
                    else if (val1.equalsIgnoreCase("Pound") && val2.equalsIgnoreCase("Tonne")) {
                        pound p = new pound(v1);
                        ans = p.tonne();
                        conv2.setText(ans.toString());
                    }
                }
            }

        });
    }
}




class temperature {
    double temp_val;
    void set_value(double c) { temp_val = c; }
    double get_value() { return temp_val; }
}
class cel
{
    temperature t=new temperature();
    double convert;
    cel(double val){ t.set_value(val); }
    double fahren()
    {
        convert=((1.8)*t.get_value())+32;
        return convert;
    }
    double kelvin()
    {
        convert=t.get_value()+273;
        return convert;
    }
}
class fah
{
    temperature t=new temperature();
    double convert;
    fah(double val){ t.set_value(val); }
    double celsius()
    {
        convert=(t.get_value()-32)*(0.56);
        return convert;
    }
    double kelvin()
    {
        convert=(t.get_value()+459.67)*0.56;
        return convert;
    }
}
class kel
{
    temperature t=new temperature();
    double convert;
    kel(double val){ t.set_value(val); }
    double celsius()
    {
        convert=t.get_value()-273;
        return convert;
    }
    double fahren()
    {
        convert=(t.get_value()*1.8)-459.67;
        return convert;
    }
}

class currency
{
    double convert;
    void set_value(double val){ this.convert=val; }
    double get_value(){ return convert;}
}
class us_dollar
{
    currency c=new currency();
    double con_cur;
    us_dollar(double val){ c.set_value(val);}
    double rupees()
    {
        con_cur=64.05*c.get_value();
        return con_cur;
    }
    double euro()
    {
        con_cur=0.84*c.get_value();
        return con_cur;
    }
    double sg_dollar()
    {
        con_cur=1.34*c.get_value();
        return con_cur;
    }
    double yen()
    {
        con_cur=113.31*c.get_value();
        return con_cur;
    }
}
class rupees
{
    currency c=new currency();
    double con_cur;
    rupees(double val){ c.set_value(val);}
    double us_dollar()
    {
        con_cur=0.016*c.get_value();
        return con_cur;
    }
    double euro()
    {
        con_cur=0.013*c.get_value();
        return con_cur;
    }
    double sg_dollar()
    {
        con_cur=0.021*c.get_value();
        return con_cur;
    }
    double yen()
    {
        con_cur=1.77*c.get_value();
        return con_cur;
    }
}class euro {
    currency c = new currency();
    double con_cur;

    euro(double val) {
        c.set_value(val);
    }

    double rupees() {
        con_cur = 75.95 * c.get_value();
        return con_cur;
    }

    double us_dollar() {
        con_cur = 1.19 * c.get_value();
        return con_cur;
    }

    double sg_dollar() {
        con_cur = 1.59 * c.get_value();
        return con_cur;
    }

    double yen() {
        con_cur = 134.36 * c.get_value();
        return con_cur;
    }
}
class sg_dollar {
    currency c = new currency();
    double con_cur;

    sg_dollar(double val) {
        c.set_value(val);
    }

    double rupees() {
        con_cur = 47.70 * c.get_value();
        return con_cur;
    }

    double us_dollar() {
        con_cur = 0.74 * c.get_value();
        return con_cur;
    }

    double euro() {
        con_cur = 0.63 * c.get_value();
        return con_cur;
    }

    double yen(){
        con_cur = 84.35 * c.get_value();
        return con_cur;
    }
}
class yen {
    currency c = new currency();
    double con_cur;

    yen(double val) {
        c.set_value(val);
    }

    double rupees() {
        con_cur = 0.57 * c.get_value();
        return con_cur;
    }

    double us_dollar() {
        con_cur = 0.0088 * c.get_value();
        return con_cur;
    }

    double euro() {
        con_cur = 0.0074 * c.get_value();
        return con_cur;
    }

    double sgd(){
        con_cur = 0.012 * c.get_value();
        return con_cur;
    }
}

class distance
{
    double convert;
    void set_input(double val){ this.convert=val; }
    double get_input(){ return convert; }
}
class meter
{
    distance d=new distance();
    double dist_con;
    meter(double val){ d.set_input(val);}
    double centimeter()
    {
        dist_con=(100)*d.get_input();
        return dist_con;
    }
    double kilometer()
    {
        dist_con=(0.001)*d.get_input();
        return dist_con;
    }
    double feet()
    {
        dist_con=(3.28084)*d.get_input();
        return dist_con;
    }
    double inches()
    {
        dist_con=(39.3701)*d.get_input();
        return dist_con;
    }
    double millimeter()
    {
        dist_con=(1000)*d.get_input();
        return dist_con;
    }
    double mile()
    {
        dist_con=(0.000621371)*d.get_input();
        return dist_con;
    }
}
class centimeter
{
    distance d=new distance();
    double dist_con;
    centimeter(double val){ d.set_input(val);}
    double meter()
    {
        dist_con=(0.01)*d.get_input();
        return dist_con;
    }
    double kilometer()
    {
        dist_con=(0.00001)*d.get_input();
        return dist_con;
    }
    double feet()
    {
        dist_con=(0.0328084)*d.get_input();
        return dist_con;
    }
    double inches()
    {
        dist_con=(0.393701)*d.get_input();
        return dist_con;
    }
    double millimeter()
    {
        dist_con=(9.999996906)*d.get_input();
        return dist_con;
    }
    double mile()
    {
        dist_con=(6.21371e-6)*d.get_input();
        return dist_con;
    }
}
class kilometer
{
    distance d=new distance();
    double dist_con;
    kilometer(double val){ d.set_input(val);}
    double meter()
    {
        dist_con=(1000)*d.get_input();
        return dist_con;
    }
    double centimeter()
    {
        dist_con=(100000)*d.get_input();
        return dist_con;
    }
    double feet()
    {
        dist_con=(3280.84)*d.get_input();
        return dist_con;
    }
    double inches()
    {
        dist_con=(39370.079)*d.get_input();
        return dist_con;
    }
    double millimeter()
    {
        dist_con=(1e+6)*d.get_input();
        return dist_con;
    }
    double mile()
    {
        dist_con=(0.621371)*d.get_input();
        return dist_con;
    }
}
class feet
{
    distance d=new distance();
    double dist_con;
    feet(double val){ d.set_input(val);}
    double meter()
    {
        dist_con=(0.305)*d.get_input();
        return dist_con;
    }
    double centimeter()
    {
        dist_con=(30.48)*d.get_input();
        return dist_con;
    }
    double kilometer()
    {
        dist_con=(0.000305)*d.get_input();
        return dist_con;
    }
    double inches()
    {
        dist_con=(12)*d.get_input();
        return dist_con;
    }
    double millimeter()
    {
        dist_con=(304.8)*d.get_input();
        return dist_con;
    }
    double mile()
    {
        dist_con=(0.000189394)*d.get_input();
        return dist_con;
    }
}
class inches
{
    distance d=new distance();
    double dist_con;
    inches(double val){ d.set_input(val);}
    double meter()
    {
        dist_con=(0.0254)*d.get_input();
        return dist_con;
    }
    double centimeter()
    {
        dist_con=(2.54)*d.get_input();
        return dist_con;
    }
    double kilometer()
    {
        dist_con=(0.0000254)*d.get_input();
        return dist_con;
    }
    double feet()
    {
        dist_con=(0.0833)*d.get_input();
        return dist_con;
    }
    double millimeter()
    {
        dist_con=(25.4)*d.get_input();
        return dist_con;
    }
    double mile()
    {
        dist_con=(1.5783e-5)*d.get_input();
        return dist_con;
    }
}
class millimeter
{
    distance d=new distance();
    double dist_con;
    millimeter(double val){ d.set_input(val);}
    double meter()
    {
        dist_con=(0.001)*d.get_input();
        return dist_con;
    }
    double centimeter()
    {
        dist_con=(0.1)*d.get_input();
        return dist_con;
    }
    double kilometer()
    {
        dist_con=(1e-6)*d.get_input();
        return dist_con;
    }
    double inches()
    {
        dist_con=(0.0393701)*d.get_input();
        return dist_con;
    }
    double feet()
    {
        dist_con=(0.00328084)*d.get_input();
        return dist_con;
    }
    double mile()
    {
        dist_con=(6.2137e-7)*d.get_input();
        return dist_con;
    }
}
class mile
{
    distance d=new distance();
    double dist_con;
    mile(double val){ d.set_input(val);}
    double meter()
    {
        dist_con=(1609.34)*d.get_input();
        return dist_con;
    }
    double centimeter()
    {
        dist_con=(160934)*d.get_input();
        return dist_con;
    }
    double kilometer()
    {
        dist_con=(1.60934)*d.get_input();
        return dist_con;
    }
    double inches()
    {
        dist_con=(63360)*d.get_input();
        return dist_con;
    }
    double feet()
    {
        dist_con=(5280)*d.get_input();
        return dist_con;
    }
    double millimeter()
    {
        dist_con=(1.609e+6)*d.get_input();
        return dist_con;
    }
}
class mass
{
    double convert;
    void set_input(double val){ this.convert=val; }
    double get_input(){ return convert; }
}
class gram
{
    mass m=new mass();
    double dist_con;
    gram(double val){ m.set_input(val);}
    double milligram()
    {
        dist_con=(1000)*m.get_input();
        return dist_con;
    }
    double tonne()
    {
        dist_con=(1e-6)*m.get_input();
        return dist_con;
    }
    double kilogram()
    {
        dist_con=(0.001)*m.get_input();
        return dist_con;
    }
    double pound()
    {
        dist_con=(0.00220462)*m.get_input();
        return dist_con;
    }
    double ounce()
    {
        dist_con=(0.035274)*m.get_input();
        return dist_con;
    }
}
class milligram
{
    mass m=new mass();
    double dist_con;
    milligram(double val){ m.set_input(val);}
    double gram()
    {
        dist_con=(0.001)*m.get_input();
        return dist_con;
    }
    double tonne()
    {
        dist_con=(1e-9)*m.get_input();
        return dist_con;
    }
    double kilogram()
    {
        dist_con=(1e-6)*m.get_input();
        return dist_con;
    }
    double pound()
    {
        dist_con=(2.2046e-6)*m.get_input();
        return dist_con;
    }
    double ounce()
    {
        dist_con=(3.5274e-5)*m.get_input();
        return dist_con;
    }
}
class kilogram
{
    mass m=new mass();
    double dist_con;
    kilogram(double val){ m.set_input(val);}
    double milligram()
    {
        dist_con=(1e+6)*m.get_input();
        return dist_con;
    }
    double tonne()
    {
        dist_con=(0.001)*m.get_input();
        return dist_con;
    }
    double gram()
    {
        dist_con=(1000)*m.get_input();
        return dist_con;
    }
    double pound()
    {
        dist_con=(2.20462)*m.get_input();
        return dist_con;
    }
    double ounce()
    {
        dist_con=(35.274)*m.get_input();
        return dist_con;
    }
}
class tonne
{
    mass m=new mass();
    double dist_con;
    tonne(double val){ m.set_input(val);}
    double milligram()
    {
        dist_con=(1e+9)*m.get_input();
        return dist_con;
    }
    double gram()
    {
        dist_con=(1e+6)*m.get_input();
        return dist_con;
    }
    double kilogram()
    {
        dist_con=(1000)*m.get_input();
        return dist_con;
    }
    double pound()
    {
        dist_con=(2204.62)*m.get_input();
        return dist_con;
    }
    double ounce()
    {
        dist_con=(35274)*m.get_input();
        return dist_con;
    }
}
class pound
{
    mass m=new mass();
    double dist_con;
    pound(double val){ m.set_input(val);}
    double milligram()
    {
        dist_con=(453592)*m.get_input();
        return dist_con;
    }
    double gram()
    {
        dist_con=(453.592)*m.get_input();
        return dist_con;
    }
    double kilogram()
    {
        dist_con=(0.453592)*m.get_input();
        return dist_con;
    }
    double tonne()
    {
        dist_con=(0.000453592)*m.get_input();
        return dist_con;
    }
    double ounce()
    {
        dist_con=(16)*m.get_input();
        return dist_con;
    }
}
class ounce
{
    mass m=new mass();
    double dist_con;
    ounce(double val){ m.set_input(val);}
    double milligram()
    {
        dist_con=(28349.5)*m.get_input();
        return dist_con;
    }
    double gram()
    {
        dist_con=(28.3495)*m.get_input();
        return dist_con;
    }
    double kilogram()
    {
        dist_con=(0.0283495)*m.get_input();
        return dist_con;
    }
    double pound()
    {
        dist_con=(0.0625)*m.get_input();
        return dist_con;
    }
    double tonne()
    {
        dist_con=(2.835e-5)*m.get_input();
        return dist_con;
    }
}
