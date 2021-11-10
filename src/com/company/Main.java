package com.company;

public class Main {

    public static void main(String[] args) {
        Shape square = new Square(new Red());
        System.out.println(square.draw());

        Shape triangle = new Triangle(new Blue());
        System.out.println(triangle.draw());
    }
}

