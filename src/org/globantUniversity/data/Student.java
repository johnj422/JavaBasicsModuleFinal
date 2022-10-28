package org.globantUniversity.data;

public class Student {
    private String name;
    private int id;
    private int age;
    private static int counter = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = 1 + counter;
        counter++;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\n" + "\t" + name + "\t\t" + "Id: " + id + "\t\t" + "Age: " + age;
    }
}
