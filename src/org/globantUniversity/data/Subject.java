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

    public boolean addStudentToSubject(Student student) {
        if (studentsList.contains(student)){
            return false;
        }
        this.studentsList.add(student);
        return true;
    }

    @Override
    public String toString() {

        return "Subject: " + name + "\t" +
                "ClassRoom: " + classRoom + "\n" +
                "Teacher: " + teacher.getName() + "\n" ;
                //"Students: " + studentsList + "\n" + "\n";
    }
}
