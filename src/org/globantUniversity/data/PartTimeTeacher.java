package org.globantUniversity.data;

public class PartTimeTeacher extends Teacher{
    private int activeHours;

    public PartTimeTeacher(String name, int activeHours) {
        this.name = name;
        this.activeHours = activeHours;
        this.baseSalary = 2000;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * this.activeHours;
    }

    @Override
    public String toString() {
        return " " + name + " \t" +
                " BaseSalary: " + baseSalary + " \t" +
                " Salary: " + calculateSalary();
    }
}
