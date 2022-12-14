package org.globantUniversity.data;

public class FullTimeTeacher extends Teacher {
    private int experienceYears;

    public FullTimeTeacher(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.baseSalary = 5000;
    }

    /**
     * Calculates teacher's base salary based on its experienceYears.
     * @return Teacher's base salary.
     */
    @Override
    public double calculateSalary() {
        return baseSalary * 1.1 * experienceYears;
    }

    @Override
    public String toString() {
        return " " + name + " \t" +
                " BaseSalary: " + baseSalary + " \t" +
                " Salary: " + calculateSalary();
    }
}
