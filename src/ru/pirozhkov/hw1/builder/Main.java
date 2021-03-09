package ru.pirozhkov.hw1.builder;

public class Main {

    public static void main(String[] args) {

        Person person = new Person.Builder("Stepan", "Ivanov").setAge(15).setGender("male").build();
    }
}
