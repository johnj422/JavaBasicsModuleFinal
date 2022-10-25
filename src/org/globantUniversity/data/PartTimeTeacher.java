package org.globantUniversity.data;

public class PartTimeTeacher extends Teacher{
    private int activeHours;

    public PartTimeTeacher(String name, int activeHours) {
        this.name = name;
        this.salary = setSalary();
        this.activeHours = activeHours;
    }

    @Override
    public double setSalary() {
        return baseSalary * activeHours;
    }
}
