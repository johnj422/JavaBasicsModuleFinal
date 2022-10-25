package org.globantUniversity.data;

public abstract class Teacher {
    private String name;
    private double baseSalary;
    private double salary;

    public abstract double setSalary();

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getSalary() {
        return salary;
    }
}
