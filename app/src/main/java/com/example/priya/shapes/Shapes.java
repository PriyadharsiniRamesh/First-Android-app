package com.example.priya.shapes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Shapes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
        Button btn_2d=(Button)findViewById(R.id.button2d);
        Button btn_3d=(Button)findViewById(R.id.button3d);
        btn_2d.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Shapes.this, Two_d.class);
                startActivity(intent1);
            }
        });
        btn_3d.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Shapes.this, Three_d.class);
                startActivity(intent2);
            }
        });

    }

}
class line
{
    double length;
    double get_input()
    {
        return length;
    }
    void set_input(double l)
    {
        this.length=l;
    }
}
class arc
{
    double radius;
    double get_input()
    {
        return radius;
    }
    void set_input(double r)
    {
        this.radius=r;
    }

}
class circle
{
    arc r=new arc();
    double area;
    double perimeter;
    circle(double side)
    {
        r.set_input(side);
    }
    double c_area()
    {
        area=3.14*r.get_input()*r.get_input();
        return area;

    }
    double c_peri()
    {
        perimeter=2*3.14*r.get_input();
        return perimeter;
    }
}
class parallelogram
{
    line b=new line();
    line h=new line();
    double area;
    double perimeter;
    parallelogram(double base,double height)
    {
        b.set_input(base);
        h.set_input(height);
    }
    double p_area()
    {
        area=b.get_input()*h.get_input();
        return area;
    }
    double p_peri()
    {
        perimeter=2*b.get_input()+2*h.get_input();
        return perimeter;
    }
}
class triangle
{
    line l=new line();
    line b=new line();
    line h=new line();
    double area,perimeter;
    triangle(double length,double base,double height)
    {
        l.set_input(length);
        b.set_input(base);
        h.set_input(height);
    }
    double t_area()
    {
        area=(0.5)*b.get_input()*h.get_input();
        return area;
    }
    double t_peri()
    {
        perimeter=l.get_input()+b.get_input()+h.get_input();
        return perimeter;
    }
}
class rectangle
{
    line l=new line();
    line b=new line();
    double area,perimeter;
    rectangle(double length,double breadth)
    {
        l.set_input(length);
        b.set_input(breadth);
    }
    double r_area()
    {
        area=l.get_input()*b.get_input();
        return area;
    }
    double r_peri()
    {
        perimeter=2*(l.get_input()+b.get_input());
        return perimeter;
    }
}
class square
{
    line a=new line();
    double area,perimeter;
    square(double side)
    {
        a.set_input(side);
    }
    double s_area()
    {
        area=a.get_input()*a.get_input();
        return area;
    }
    double s_peri()
    {
        perimeter=4*a.get_input();
        return perimeter;
    }
}
class ellipse
{
    arc r1=new arc();
    arc r2=new arc();
    double area,perimeter;
    ellipse(double radius1,double radius2)
    {
        r1.set_input(radius1);
        r2.set_input(radius2);
    }
    double e_area()
    {
        area=(3.14)*r1.get_input()*r2.get_input();
        return area;
    }
    double e_peri()
    {
        perimeter=2*(3.14)*Math.sqrt(r1.get_input()*r2.get_input());
        return perimeter;
    }
}
class pentagon
{
    line b=new line();
    line h=new line();
    double area,perimeter;
    pentagon(double base,double height)
    {
        b.set_input(base);
        h.set_input(height);
    }
    double p_area()
    {
        area=5*(0.5)*b.get_input()*h.get_input();
        return area;
    }
    double p_peri()
    {
        perimeter=5*b.get_input();
        return perimeter;
    }
}
class hexagon
{
    line b=new line();
    line h=new line();
    double area,perimeter;
    hexagon(double base,double height)
    {
        b.set_input(base);
        h.set_input(height);
    }
    double h_area()
    {
        area=6*(0.5)*b.get_input()*h.get_input();
        return area;
    }
    double h_peri()
    {
        perimeter=6*b.get_input();
        return perimeter;
    }
}
class octagon
{
    line b=new line();
    line h=new line();
    double area,perimeter;
    octagon(double base,double height)
    {
        b.set_input(base);
        h.set_input(height);
    }
    double o_area()
    {
        area=8*(0.5)*b.get_input()*h.get_input();
        return area;
    }
    double o_peri()
    {
        perimeter=8*b.get_input();
        return perimeter;
    }
}
class cone
{
    line r=new line();
    line h=new line();
    double area,volume;
    cone(double radius,double height)
    {
        r.set_input(radius);
        h.set_input(height);
    }
    double c_area()
    {
        area=(3.14)*(r.get_input())*(r.get_input()+h.get_input());
        return area;
    }
    double c_vol()
    {
        volume=(0.34)*(3.14)*r.get_input()*r.get_input()*h.get_input();
        return volume;
    }
}
class cylinder
{
    line r=new line();
    line h=new line();
    double area,volume;
    cylinder(double radius,double height)
    {
        r.set_input(radius);
        h.set_input(height);
    }
    double c_area()
    {
        area=2*(3.14)*(r.get_input())*(r.get_input()+h.get_input());
        return area;
    }
    double c_vol()
    {
        volume=(3.14)*r.get_input()*r.get_input()*h.get_input();
        return volume;
    }
}
class cube
{
    line s=new line();
    double area,volume;
    cube(double side)
    {
        s.set_input(side);
    }
    double c_area()
    {
        area=6*s.get_input()*s.get_input();
        return area;
    }
    double c_vol()
    {
        volume=s.get_input()*s.get_input()*s.get_input();
        return volume;
    }
}
class cuboid
{
    line l=new line();
    line b=new line();
    line h=new line();
    double area,volume;
    cuboid(double length,double breadth,double height)
    {
        l.set_input(length);
        b.set_input(breadth);
        h.set_input(height);
    }
    double c_area()
    {
        area=2*((l.get_input()*b.get_input())+(b.get_input()*h.get_input())+(h.get_input()*l.get_input()));
        return area;
    }
    double c_vol()
    {
        volume=l.get_input()*b.get_input()*h.get_input();
        return volume;
    }
}
class sphere
{
    line r=new line();
    double area,volume;
    sphere(double radius)
    {
        r.set_input(radius);
    }
    double s_area()
    {
        area=4*(3.14)*r.get_input()*r.get_input();
        return area;
    }
    double s_vol()
    {
        volume=(1.34)*(3.14)*r.get_input()*r.get_input()*r.get_input();
        return volume;
    }
}
class hemisphere
{
    line r=new line();
    double area,volume;
    hemisphere(double radius)
    {
        r.set_input(radius);
    }
    double h_area()
    {
        area=3*(3.14)*r.get_input()*r.get_input();
        return area;
    }
    double h_vol()
    {
        volume=(0.67)*(3.14)*r.get_input()*r.get_input();
        return volume;
    }
}
