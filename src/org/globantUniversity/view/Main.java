package org.globantUniversity.view;

import org.globantUniversity.data.Student;
import org.globantUniversity.data.Subject;
import org.globantUniversity.data.Teacher;
import org.globantUniversity.data.University;
import org.globantUniversity.persistence.DataInitializer;
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
            System.out.println("\n ** University's System **");
            System.out.println(" ---------------------------");
            System.out.println("1. View teachers");
            System.out.println("2. View Subjects");
            System.out.println("3. Create New Student");
            System.out.println("4. Create New Subject");
            System.out.println("5. View All Student Subjects");
            System.out.println("6. Exit");
            option = scan.nextInt();
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
                    System.out.println("Test");
                    break;
                default:
                    System.out.println("Please enter a valid option");
                    printMainMenu(myUniversity);
            }
        } while (option < 6);
    }

    public static void printAllTeachers(University myUniversity){
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
            option = scan.nextInt();
            scan = new Scanner(System.in);
            if (option < 1 || option > myUniversity.getSubjectListSize()){
                System.out.println("Please enter a valid Subject's number \n");
            } else {
                int index = option -1;
                System.out.println(myUniversity.getSubjectByIndex(index));

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
        System.out.println("Please enter Student's Age: \n");
        age = scan.nextInt();
        scan = new Scanner(System.in);
        Student student = new Student(name, age);
        myUniversity.addStudent(student);
        System.out.println("Please select the number of the subject where the student is entering: ");
        for (int i = 0; i < myUniversity.getSubjectListSize(); i++){
            System.out.println("\t" + (i + 1) + ". " + myUniversity.getSubjectNameByIndex(i));
        }
        subjectIndex = scan.nextInt();
        if (subjectIndex < 1 || subjectIndex > myUniversity.getSubjectListSize()){
            System.out.println("Please enter a valid Subject's number \n");
        } else {
            int index = subjectIndex -1;
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
        System.out.println("Please select the teacher for that subject: ");
        printAllTeachers(myUniversity);
        option = scan.nextInt();
        scan = new Scanner(System.in);
        int index = option - 1;
        scan = new Scanner(System.in);
        teacher = myUniversity.getTeacherByIndex(index);
        Subject subject = new Subject(subjectName, classRoom, teacher);
        myUniversity.addSubject(subject);
        System.out.println("The Subject " + subjectName + " has been created with teacher " + teacher.getName()+ "\n");
        System.out.println("Do you want to add some students to the Subject: " + subjectName + "?");
        System.out.println(" 1. Yes");
        System.out.println(" 2. No");
        option = scan.nextInt();
        scan = new Scanner(System.in);
        int id;
        Student student;
        do {
            System.out.println("Please enter Student´s ID: ");
            id = scan.nextInt();
            scan = new Scanner(System.in);
            student = myUniversity.getStudentById(id);
            if (student != null) {
                subject.addStudentToSubject(student);
                System.out.println("Well done " + student.getName() + " was successfully added to " + subjectName);
            }
            System.out.println("Do you want to add more Students to the Subject?");
            System.out.println(" 1. Yes");
            System.out.println(" 2. No");
            option = scan.nextInt();

        }while (option == 1);
    }
}