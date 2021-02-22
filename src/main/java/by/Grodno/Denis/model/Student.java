package main.java.by.Grodno.Denis.model;

import java.util.function.Consumer;

public class Student {
    static public Student create(Consumer<UserBuilder> buildingFunction) {
        return new Student().build(buildingFunction);
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private Student() {

    }

    private Student build(Consumer<UserBuilder> buildingFunction) {
        buildingFunction.accept(new UserBuilder() {

            @Override
            public UserBuilder withName(String name) {
                Student.this.name = name;
                return this;
            }

            @Override
            public UserBuilder withAge(int age) {
                Student.this.age = age;
                return this;
            }
        });

        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("the name must not be null or empty");
        }

        if (age <= 0) {
            throw new IllegalStateException("the age must be > 0");
        }

        return this;
    }
}

interface UserBuilder {

    UserBuilder withName(String name);

    UserBuilder withAge(int age);
}