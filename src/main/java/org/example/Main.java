package org.example;

import shapes.Shape;
import shapes.Square;

public class Main {
    public static void main(String[] args) {

        Square square1 = new Square(10,11,"red",true,25);
        System.out.println(square1.getPerimeter());
        System.out.println(square1.getArea());
        System.out.println(square1);


    }
}