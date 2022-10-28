package org.globantUniversity.data;

import java.util.ArrayList;

public class Subject {
    private String name;
    private int classRoom;
    private ArrayList<Student> studentsList;
    private Teacher teacher;

    public Subject(String name, int classRoom, Teacher teacher) {
        this.name = name;
        this.classRoom = classRoom;
        this.teacher = teacher;
        this.studentsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void addStudentToSubject(Student student) {
        this.studentsList.add(student);
    }

    @Override
    public String toString() {

        return "Subject: " + name + "\t" +
                "ClassRoom: " + classRoom + "\n" +
                "Teacher: " + teacher + "\n" ;
                //"Students: " + studentsList + "\n" + "\n";
    }
}
