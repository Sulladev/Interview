package ru.pirozhkov.hw1.polymorphism;

public class Rectangle extends Shape {

    private int a;

    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double Area() {
        return a * b;
    }

    @Override
    public void Print() {
        System.out.println("rectangle area: " + Area());
    }
}
