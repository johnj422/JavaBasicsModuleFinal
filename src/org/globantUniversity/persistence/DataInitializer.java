package org.globantUniversity.persistence;

import org.globantUniversity.data.*;

public class DataInitializer {
    public static void loadUniversity(){
        University myUniversity = new University();
        loadStudentsToUniversity(myUniversity);
        loadTeachersToUniversity(myUniversity);
        loadSubjectsToUniversity(myUniversity);
    }
    private static void loadStudentsToUniversity(University myUniversity) {
        Student student1 = new Student("John Arango", 41);
        Student student2 = new Student("Mary Ann", 42);
        Student student3 = new Student("Jaime Sarmiento", 43);
        Student student4 = new Student("Carlos Rodriguez", 44);
        Student student5 = new Student("Maria Anders", 45);
        Student student6 = new Student("Mariana Sanchez", 46);
        myUniversity.addStudent(student1);
        myUniversity.addStudent(student2);
        myUniversity.addStudent(student3);
        myUniversity.addStudent(student4);
        myUniversity.addStudent(student5);
        myUniversity.addStudent(student6);

    }
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
    private static void loadSubjectsToUniversity(University myUniversity){
        Subject subject1 = new Subject("Maths", 1, myUniversity.assignTeacher(1));
        Subject subject2 = new Subject("English", 2, myUniversity.assignTeacher(2));
        Subject subject3 = new Subject("Physics", 3, myUniversity.assignTeacher(3));
        Subject subject4 = new Subject("Chemistry", 4, myUniversity.assignTeacher(4));
        myUniversity.addSubject(subject1);

    }
}
