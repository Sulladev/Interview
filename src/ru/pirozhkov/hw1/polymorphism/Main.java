package ru.pirozhkov.hw1.polymorphism;

public class Main {

    static public void main (String[] args) {
        Shape circle = new Circle(1);
        circle.Print();
        Shape rectangle = new Rectangle(2,2);
        rectangle.Print();
    }
}
