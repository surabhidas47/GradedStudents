package io.zipcoder;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;

    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();

        for (int i = 0; i < testScores.length; i++) {
            examScores.add(testScores[i]);
        }

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName = lastName;
    }

    public String getExamScores() {
        //should return all exam scores in its own line
        //  rmr \n for new line  \t for tab
        StringBuilder sb = new StringBuilder("Exam Scores: \n");

        for (int i = 0; i < examScores.size(); i++) {
            //we do i+1 here bc arrays index start at 0!!!!
            sb.append("tExam").append(" ->").append(i + 1).append(examScores.get(i));
        }
        return sb.toString();

    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);

    }
}




