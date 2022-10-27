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
    public int getSubjectListSize() {
        return subjectsList.size();
    }
    public void addSubject(Subject subject) {
        subjectsList.add(subject);
    }
    public ArrayList<Teacher> getTeachersList() {
        return teachersList;
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
    public Teacher assignTeacher(int index) {
        return teachersList.get(index);
    }
    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }
    public Student getStudentByIndex(int index) {
        return studentsList.get(index);
    }
    public void addStudent(Student student) {
        studentsList.add(student);
    }
    public void addAllStudentsToSubject(){
        for (Subject subject : subjectsList) {
            subject.addAllStudents(studentsList);
        }
    }

}
