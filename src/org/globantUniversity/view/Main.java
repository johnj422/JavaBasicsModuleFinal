package org.globantUniversity.view;

import org.globantUniversity.data.University;
import org.globantUniversity.persistence.DataInitializer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University myUniversity = DataInitializer.loadUniversity();
        mainMenu(myUniversity);
        //testDataInit(myUniversity);


    }

    public static void mainMenu(University myUniversity) {
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            System.out.println("\n ** University's System **");
            System.out.println("-------------------------");
            System.out.println("1. View teachers");
            System.out.println("2. View Subjects");
            System.out.println("3. Create New Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Create New Subject");
            System.out.println("6. View All Student Subjects");
            System.out.println("7. Exit");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    printAllTeachers(myUniversity);
                    scan = new Scanner(System.in);
                    break;
            }
        } while (option < 7);

    }
    public static void printAllTeachers(University myUniversity){
        for (int i = 0; i < myUniversity.getTeachersList().size(); i++){
            System.out.println(myUniversity.getTeacherByIndex(i));
        }

    }
    public static void testDataInit(University myUniversity){
        for (int i = 0; i < myUniversity.getSubjectsList().size(); i++) {
           System.out.println(myUniversity.getSubjectsList().get(i));

        }
    }
}
