package com.dmdev.oop.part1;

public abstract class Shape {

    private String color;

    public abstract double getArea();

    public Shape (String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    }
