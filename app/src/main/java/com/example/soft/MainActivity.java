package com.example.soft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

class color{
    public String name ;
    public color(String name){
        this.name = name ;
    }
    public String showColor() {
        return "The color is " + name + "\n";
    }
}

class Red extends color{
    public Red(){
        super("Red");
    }
}

class Green extends color{
    public Green(){
        super("Green");
    }
}

class Blue extends color{
    public Blue(){
        super("Blue");
    }
}

class shape{
    public String name ;

    public shape(String name){
        this.name = name ;
    }

    public String showShape() {
        return "The shape is " + name + "\n" + "Area is " + area() + "\n" + "Perimeter is " + perimeter() + "\n";
    }

    public float area(){
        return 0;
    }

    public float perimeter(){
        return 0;
    }
}

class Circle extends shape{
    public  float radius ;

    public Circle(float radius) {
        super("Circle");
        this.radius = radius;
    }

    public float area(){
        return (float) (3.14 * radius * radius);
    }

    public float perimeter(){
        return (float) (2 * 3.14 * radius);
    }
}

class Square extends shape{
    public  float side_length ;

    public Square(float side) {
        super("Square");
        this.side_length = side;
    }

    public float area(){
        return (side_length * side_length);
    }

    public float perimeter(){
        return (4 * side_length);
    }
}

class Triangle extends shape{
    public  float side1 , side2 , side3 ;

    public Triangle(float side1 , float side2 , float side3) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float area(){
        float s = (side1 + side2 + side3) / 2;
        return (float) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public float perimeter(){
        return (side1 + side2 + side3);
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}