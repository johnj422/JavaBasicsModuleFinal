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

    public ArrayList<Subject> getSubjectsList() {
        return subjectsList;
    }

    public ArrayList<Teacher> getTeachersList() {
        return teachersList;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }
    public void addTeacher(Teacher teacher) {
        teachersList.add(teacher);
    }
    public Teacher assignTeacher(int value) {
        return teachersList.get(value - 1);
    }
    public void addSubject(Subject subject) {
        subjectsList.add(subject);
    }
    public void addAllStudentsToSubject(){
        for (Subject subject : subjectsList) {
            subject.addAllStudents(studentsList);
        }

    }
}
