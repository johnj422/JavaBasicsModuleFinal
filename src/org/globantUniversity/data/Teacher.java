package org.globantUniversity.data;

public abstract class Teacher {
    protected String name;
    protected double baseSalary;

    public abstract double calculateSalary();
    public String getName() {
        return name;
    }
}
