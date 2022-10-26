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
    public String getSubjectByClassroom(int classroom) {
        Subject subjectToView = subjectsList.get(classroom);
        return subjectToView.getNameOptions();
    }
    public Subject getSubjectByOption(int option) {
        return subjectsList.get(option - 1);
    }
    public int subjectListSize() {
        return subjectsList.size();
    }
    public ArrayList<Teacher> getTeachersList() {
        return teachersList;
    }
    public Teacher getTeacherByIndex(int index) {
        return teachersList.get(index);
    }
    public int teacherListSize() {
        return teachersList.size();
    }
    public Student getStudentByIndex(int index) {
        return studentsList.get(index);
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
