package org.globantUniversity.data;

public class FullTimeTeacher extends Teacher {
    private int experienceYears;
    public FullTimeTeacher(String name, int experienceYears) {
        this.name = name;
        this.salary = setSalary();
        this.experienceYears = experienceYears;
    }
    @Override
    public double setSalary() {
        return baseSalary * 1.1 * experienceYears;
    }
}
