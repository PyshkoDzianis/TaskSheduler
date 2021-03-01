package main.java.by.Grodno.Denis.model;

import java.util.function.Consumer;

import java.util.Random;

public class Student extends StudentBase {
    private final Random random = new Random();
    private final String name;
    private final int age;

    public Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }


    @Override
    public Integer getId() {
        return random.nextInt();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }