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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "\n" + "   " + name + "\t\t" + "Id: " + id + "\t\t" + "Age: " + age;
    }
}
