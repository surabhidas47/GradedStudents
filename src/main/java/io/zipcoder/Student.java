package io.zipcoder;



import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;

    private ArrayList<Double> examScores;


    public Student() {
        this.examScores = new ArrayList<>();

    }
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
            sb.append(String.format("\tExam %d -> %.2f\n",i+1,examScores.get(i)));
        }
        return sb.toString();

    }

    public int getNumberOfExamScores(){
        return examScores.size();
    }
    public void addExamScore(double examScore) {
        examScores.add(examScore);

    }

    public Double getAverageExamScore() {
        double sum = 0.0;
        for (Double e :examScores){
            sum += e;
        }
        return sum/ examScores.size();
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();

        //appending the name part
        //%s is a placeholder for a string
        sb.append(String.format("Student Name: %s %s\n",firstName, lastName));
        //appending the scores
        sb.append(String.format("> Average Score: %.2f\n> ", getAverageExamScore()));
        //the avg
        sb.append(getExamScores());
        return sb.toString();
    }



}




