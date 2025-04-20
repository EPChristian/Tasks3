package com.dmdev.oop.part1;


import com.dmdev.oop.part4.Movable;

public class ShapeRunner {

    public static void main(String[] args) {

        Drawable[] shapes = new Drawable[]{
                new Circle("Жёлтый", 4),
                new Rectangle("Чёрный", 5, 9),
                new Circle("Синий"),
                new Rectangle("Фиолетовый")
        };

        ((Circle) shapes[2]).setRadius(10);
        ((Rectangle) shapes[3]).setWidth(1);
        ((Rectangle) shapes[3]).setHeight(3);

        for (Drawable a : shapes) {
            a.draw();

            Shape s = (Shape) a;
            System.out.println("Площадь: " + s.getArea());
            }
        }
    }
