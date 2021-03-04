package ru.pirozhkov.hw1.polymorphism;

public class Circle extends Shape {
    private int a;

    public Circle(int a) {
        this.a = a;
    }

    @Override
    public double Area() {
        return Math.PI * a * a;
    }

    @Override
    public void Print() {
        System.out.println("circle area: " + Area());
    }
}
