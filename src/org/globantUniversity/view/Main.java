package org.globantUniversity.view;

import org.globantUniversity.data.University;
import org.globantUniversity.persistence.DataInitializer;

public class Main {
    public static void main(String[] args) {
        University myUniversity = DataInitializer.loadUniversity();
        testDataInit(myUniversity);


    }

    public static void testDataInit(University myUniversity){
        for (int i = 0; i < myUniversity.getSubjectsList().size(); i++) {
           System.out.println(myUniversity.getSubjectsList().get(i));

        }
    }
}
