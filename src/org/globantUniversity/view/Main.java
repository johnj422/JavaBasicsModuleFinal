package org.globantUniversity.view;

import com.sun.prism.PixelFormat;
import org.globantUniversity.data.University;
import org.globantUniversity.persistence.DataInitializer;

import java.sql.DataTruncation;
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
            System.out.println("4. Delete Student");
            System.out.println("5. Create New Subject");
            System.out.println("6. View All Student Subjects");
            System.out.println("7. Exit");
            option = scan.nextInt();
            scan = new Scanner(System.in);

            switch (option) {
                case 1:
                    printAllTeachers(myUniversity);
                    //scan = new Scanner(System.in);
                    break;
                case 2:
                    printAllSubjects(myUniversity);
                    //scan = new Scanner(System.in);
                    break;
            }
        } while (option < 7);
    }
    public static void printAllTeachers(University myUniversity){
        for (int i = 0; i < myUniversity.getTeacherListSize(); i++){
            System.out.println(myUniversity.getTeacherByIndex(i));
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
}