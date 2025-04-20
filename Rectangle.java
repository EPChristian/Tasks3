package com.dmdev.oop.part1;

public class Rectangle extends Shape implements Drawable{

    private double width;
    private double height;

    public double getArea(){
        return width * height;
    }

    public void draw(){
        System.out.println("Нарисован прямоугольник " + getColor());
    }

    Rectangle (String color){
        super(color);
    }

    Rectangle (String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
