package org.globantUniversity.data;

public abstract class Teacher {
    protected String name;
    protected double baseSalary;
    protected double salary;

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
