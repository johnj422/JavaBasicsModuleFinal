package org.globantUniversity.view;

import org.globantUniversity.data.Student;
import org.globantUniversity.data.Subject;
import org.globantUniversity.data.Teacher;
import org.globantUniversity.data.University;
import org.globantUniversity.persistence.DataInitializer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University myUniversity = DataInitializer.loadUniversity();
        printMainMenu(myUniversity);
    }

    public static void printMainMenu(University myUniversity) {
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n ** Welcome to the University's System **");
            System.out.println(" -----------------------------------------");
            System.out.println("1. View teachers");
            System.out.println("2. View Subjects");
            System.out.println("3. Create New Student");
            System.out.println("4. Create New Subject");
            System.out.println("5. View Student Subjects");
            System.out.println("6. Exit");
            option = validateOption(scan);
            scan = new Scanner(System.in);

            switch (option) {
                case 1:
                    printAllTeachers(myUniversity);
                    break;
                case 2:
                    printAllSubjects(myUniversity);
                    break;
                case 3:
                    createNewStudent(myUniversity);
                    break;
                case 4:
                    createNewSubject(myUniversity);
                    break;
                case 5:
                    viewStudentsSubjects(myUniversity);
                    break;
                case 6:
                    System.out.println("***** Goodbye! *****");
                    break;
                default:
                    System.out.println("Please enter a valid option");
                    printMainMenu(myUniversity);
            }
        } while (option < 6);
    }

    public static void printAllTeachers(University myUniversity){
        System.out.println("\t\t\t\t\t\t Teachers ");
        System.out.println("_____________________________________________________________");
        for (int i = 0; i < myUniversity.getTeacherListSize(); i++){
            System.out.println(" " + (i + 1) + ". " + myUniversity.getTeacherByIndex(i));
        }
    }

    public static void printAllSubjects(University myUniversity) {
        Scanner scan = new Scanner(System.in);
        int option;

        System.out.println("Please enter the Subject´s number to view details: \n");
        for (int i = 0; i < myUniversity.getSubjectListSize(); i++){
            System.out.println("\t" + (i + 1) + ". " + myUniversity.getSubjectNameByIndex(i));
            }
            option = validateOption(scan);
            scan = new Scanner(System.in);
            if (option == 0){
                printMainMenu(myUniversity);
            }
            if (option < 0 || option > myUniversity.getSubjectListSize()){
                System.out.println("Please enter a valid Subject's number or 0 to exit \n");
                printAllSubjects(myUniversity);
                option = scan.nextInt();
                scan = new Scanner(System.in);

            }else{
                int index = option -1;
                Subject subject = myUniversity.getSubjectByIndex(index);
                System.out.println(subject);
                System.out.println("Students: ");
                for (Student student: subject.getStudentsList()) {
                    System.out.println(student);
                }
            }
    }

    public static void printAllStudents(University myUniversity) {
        System.out.println("\t\t\t Students ");
        System.out.println("______________________________________");
        for (int i = 0; i < myUniversity.getStudentsListSize(); i++){
            System.out.println(myUniversity.getStudentByIndex(i));
        }
    }

    public static void createNewStudent(University myUniversity){
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        int subjectIndex;
        Subject subjectToAdd;

        System.out.println("Please type Student's Full Name: \n");
        name = scan.nextLine();
        scan = new Scanner(System.in);
        do {
            System.out.println("Please enter Student's Age: \n");
            age = validateOption(scan);
            scan = new Scanner(System.in);
        } while (age == -1);

        System.out.println("Please select the number of the subject where the student is entering: ");
        for (int i = 0; i < myUniversity.getSubjectListSize(); i++){
            System.out.println("\t" + (i + 1) + ". " + myUniversity.getSubjectNameByIndex(i));
        }
        subjectIndex = validateOption(scan);
        scan = new Scanner(System.in);
        if (subjectIndex < 1 || subjectIndex > myUniversity.getSubjectListSize()){
            System.out.println("Please enter a valid Subject's number \n");
        } else {
            int index = subjectIndex -1;
            Student student = new Student(name, age);
            myUniversity.addStudent(student);
            subjectToAdd = myUniversity.getSubjectByIndex(index);
            subjectToAdd.addStudentToSubject(student);
            System.out.println("\n The Student " + name + " has been successfully created and added to " + subjectToAdd.getName() + "\n");
        }
    }

    public static void createNewSubject (University myUniversity) {
        Scanner scan = new Scanner(System.in);
        String subjectName;
        int classRoom;
        Teacher teacher;
        int option;
        System.out.println("Please enter the name of the Subject to be created: \n");
        subjectName = scan.nextLine();
        scan = new Scanner(System.in);
        System.out.println("Please enter the classroom number: ");
        classRoom = scan.nextInt();
        scan = new Scanner(System.in);

        do {
            System.out.println("Please select the teacher for that subject: \n");
            printAllTeachers(myUniversity);
            option = validateOption(scan);
            scan = new Scanner(System.in);
        } while (option < 0 || option > myUniversity.getTeacherListSize());

        int index = option - 1;
        scan = new Scanner(System.in);
        teacher = myUniversity.getTeacherByIndex(index);
        Subject subject = new Subject(subjectName, classRoom, teacher);
        myUniversity.addSubject(subject);
        System.out.println("The Subject " + subjectName + " has been created with teacher " + teacher.getName()+ "\n");
        System.out.println("Please add some students to the Subject: " + subjectName + "\n");

        int id;
        Student student;

        do {
            System.out.println("Select the Student's ID: ");
            printAllStudents(myUniversity);
            id = validateOption(scan);
            scan = new Scanner(System.in);
            student = myUniversity.getStudentById(id);
            if (student.getName() != null) {
                if (subject.addStudentToSubject(student)){
                    System.out.println("Well done " + student.getName() + " was successfully added to " + subjectName);
                    System.out.println("Do you want to add more Students to the Subject?");
                    System.out.println(" 1. Yes");
                    System.out.println(" 2. No");
                    option = validateOption(scan);

                } else {
                    System.out.println("The student is already in the Subject \n");
                    option = 1;
                }
                } else {
                System.out.println("Please select a valid option");
                option = 1;
                }
        } while (option == 1);
    }

    public static void viewStudentsSubjects(University myUniversity) {
        Scanner scan = new Scanner(System.in);
        int id;
        String studentSearched = "";
        ArrayList<String> studentsSubjects = new ArrayList<String>();

        System.out.println("Please select the Student's ID you want to consult: ");
        printAllStudents(myUniversity);
        id = scan.nextInt();
        for (Subject subject: myUniversity.getSubjectsList()) {
            for (Student student: subject.getStudentsList()){
                if (student.getId() == id) {
                    studentSearched = student.getName();
                    studentsSubjects.add(subject.getName());
                }
            }
        }
        if (studentsSubjects.size() == 0) {
            System.out.println("Student with ID: " + id + " not found");
        } else{
            System.out.println("Student " + studentSearched + " is enrolled in: \n");
            for (String subject: studentsSubjects){
                System.out.println(" --" + subject);
            }
        }
    }

    public static int validateOption(Scanner scan){
        int option = -1;
        if (scan.hasNextInt()){
            return option = scan.nextInt();
        } else {
            return option;
        }
    }
}