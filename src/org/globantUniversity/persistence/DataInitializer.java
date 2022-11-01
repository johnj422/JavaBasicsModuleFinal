package org.globantUniversity.persistence;

import org.globantUniversity.data.*;

public class DataInitializer {

    /**
     * Loads students, teachers and subjects to a new instance of University.
     * @return The new instance of University.
     */
    public static University loadUniversity(){
        University myUniversity = new University();
        loadStudentsToUniversity(myUniversity);
        loadTeachersToUniversity(myUniversity);
        loadSubjectsToUniversity(myUniversity);
        return myUniversity;
    }

    /**
     * Loads students to myUniversity.
     * @param myUniversity Is an instance of the University.
     */
    private static void loadStudentsToUniversity(University myUniversity) {
        Student student1 = new Student("John Arango", 41);
        Student student2 = new Student("Mary Ann", 42);
        Student student3 = new Student("Jaime Saenz", 43);
        Student student4 = new Student("Carlos Perez", 44);
        Student student5 = new Student("Maria Anders", 45);
        Student student6 = new Student("Mariana Sanchez", 46);
        myUniversity.addStudent(student1);
        myUniversity.addStudent(student2);
        myUniversity.addStudent(student3);
        myUniversity.addStudent(student4);
        myUniversity.addStudent(student5);
        myUniversity.addStudent(student6);
    }

    /**
     * Loads teachers to myUniversity.
     * @param myUniversity Is an instance of the University.
     */
    private static void loadTeachersToUniversity(University myUniversity) {
        Teacher teacher1 = new PartTimeTeacher("James Arthur",  24);
        Teacher teacher2 = new PartTimeTeacher("John Smith", 26);
        Teacher teacher3 = new FullTimeTeacher("Mary Smith", 10);
        Teacher teacher4 = new FullTimeTeacher("Wanda Cyrone", 15);
        myUniversity.addTeacher(teacher1);
        myUniversity.addTeacher(teacher2);
        myUniversity.addTeacher(teacher3);
        myUniversity.addTeacher(teacher4);
    }

    /**
     *Loads subjects t myUniversity, teachers and students to the subjects.
     * @param myUniversity
     */
    private static void loadSubjectsToUniversity(University myUniversity){
        Subject subject1 = new Subject("Maths", 1, myUniversity.getTeacherByIndex(0));
        Subject subject2 = new Subject("English", 2, myUniversity.getTeacherByIndex(1));
        Subject subject3 = new Subject("Physics", 3, myUniversity.getTeacherByIndex(2));
        Subject subject4 = new Subject("Chemistry", 4, myUniversity.getTeacherByIndex(3));
        myUniversity.addSubject(subject1);
        subject1.addStudentToSubject(myUniversity.getStudentByIndex(0));
        subject1.addStudentToSubject(myUniversity.getStudentByIndex(1));
        subject1.addStudentToSubject(myUniversity.getStudentByIndex(2));
        myUniversity.addSubject(subject2);
        subject2.addStudentToSubject(myUniversity.getStudentByIndex(3));
        subject2.addStudentToSubject(myUniversity.getStudentByIndex(4));
        subject2.addStudentToSubject(myUniversity.getStudentByIndex(5));
        myUniversity.addSubject(subject3);
        subject3.addStudentToSubject(myUniversity.getStudentByIndex(0));
        subject3.addStudentToSubject(myUniversity.getStudentByIndex(1));
        subject3.addStudentToSubject(myUniversity.getStudentByIndex(2));
        myUniversity.addSubject(subject4);
        subject4.addStudentToSubject(myUniversity.getStudentByIndex(3));
        subject4.addStudentToSubject(myUniversity.getStudentByIndex(4));
        subject4.addStudentToSubject(myUniversity.getStudentByIndex(5));
    }
}
