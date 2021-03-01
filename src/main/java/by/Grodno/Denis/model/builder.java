package main.java.by.Grodno.Denis.model;

class Builder {
    private String name = "";
    private int age = 0;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}