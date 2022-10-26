package org.globantUniversity.data;

public abstract class Teacher {
    protected String name;
    protected double baseSalary = 5000;
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

    @Override
    public String toString() {
        return " " + name + " \t" +
                " BaseSalary: " + baseSalary + " \t" +
                " Salary: " + salary;
    }
}
