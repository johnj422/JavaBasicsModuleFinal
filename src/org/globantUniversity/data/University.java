package org.globantUniversity.data;

import java.util.ArrayList;

public class University {
    private ArrayList<Subject> subjectsList;
    private ArrayList<Teacher> teachersList;
    private ArrayList<Student> studentsList;

    public University() {
        subjectsList = new ArrayList<>();
        teachersList = new ArrayList<>();
        studentsList = new ArrayList<>();
    }

    public String getSubjectNameByIndex(int index) {
        Subject subjectToView = subjectsList.get(index);
        return subjectToView.getName();
    }

    public Subject getSubjectByIndex(int index) {
        return subjectsList.get(index);
    }

    public ArrayList<Subject> getSubjectsList() {
        return subjectsList;
    }

    public int getSubjectListSize() {
        return subjectsList.size();
    }

    public void addSubject(Subject subject) {
        subjectsList.add(subject);
    }

    public Teacher getTeacherByIndex(int index) {
        return teachersList.get(index);
    }

    public int getTeacherListSize() {
        return teachersList.size();
    }

    public void addTeacher(Teacher teacher) {
        teachersList.add(teacher);
    }

    public Student getStudentByIndex(int index) {
        return studentsList.get(index);
    }

    public Student getStudentById(int id) {
        Student student = new Student();
        for (Student studentInList : studentsList) {
            if (studentInList.getId() == id) {
                student = studentInList;
            }
        }
        return student;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }
}
