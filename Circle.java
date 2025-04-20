package com.dmdev.oop.part1;

public class Circle extends Shape implements Drawable{

    public void draw(){
        System.out.println("Нарисован круг " + getColor());
    }

    private double radius;

    public Circle (String color){
        super(color);
    }

    public Circle (String color, double radius){
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
