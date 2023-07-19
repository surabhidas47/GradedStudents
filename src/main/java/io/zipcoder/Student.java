package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;

    private ArrayList<Double> examScores;

    public Student(String firstName,String lastName, Double [] testScores ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }

        public String getFirstName (){
            return this.firstName = firstName;
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public String getLastName (){
            return this.lastName = lastName;
        }

//    public String getExamScores() {
//
//
//        StringBuilder sb = new StringBuilder();
//
//        sb.
//
//
//
//
//    }


//    public int getNumberOfExamsTaken() {
//
//            // returns the total number of exams taken by this student.
//        }



    }



