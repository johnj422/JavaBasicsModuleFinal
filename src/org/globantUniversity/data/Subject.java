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
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(int classRoom) {
        this.classRoom = classRoom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void addStudentToSubject(Student student) {
        this.studentsList.add(student);
    }
    public void addAllStudents(ArrayList<Student> students) {
        this.studentsList = students;
    }

    @Override
    public String toString() {

        return "Subject: " + name + "\n" +
                "ClassRoom: " + classRoom + "\n" +
                "Teacher: " + teacher + "\n" +
                "Students: " + studentsList + "\n" + "\n";
    }
}
