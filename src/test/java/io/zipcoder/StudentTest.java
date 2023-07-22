package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testConstructor() {
        //given: all values of constructor
        String expectedFirstName = "Surabhi";
        String expectedLastName = "Das";
        String examScore = "Exam Scores: \n";

        // When creating a student
        Student s = new Student(expectedFirstName,expectedLastName,new Double[0]);


        //Then
        Assert.assertEquals(expectedFirstName, s.getFirstName());
        Assert.assertEquals(expectedLastName, s.getLastName());
        Assert.assertEquals(examScore, s.getExamScores());


    }



    @Test
    public void testSetFirstName() {
        //given: first name
        String expected = "Surabhi";
        //if i didnt create nullary constructor, test would expect the threee values
        Student s = new Student();

        // When
        s.setFirstName(expected);

        //Then
        Assert.assertEquals(expected, s.getFirstName());

    }

    @Test
    public void testGetFirstName() {

        String expected = "Surabhi";

        Student s = new Student();

        // When
        String actual = s.getFirstName();

        //Then
        Assert.assertEquals(expected, actual);

    }



    @Test
    public void testSetLastName() {
        //given
        //like here would have to test like this if i didnt have nullary constructoe
        Double [] testScores = {97.0, 56.5,3.0};
        Student s = new Student("Surabhi", "Das",testScores);
        String expected = "Das";


        // When
       s.setLastName(expected);

        //Then
        Assert.assertEquals(expected, s.getLastName());

    }
    @Test
    public void testGetLastName() {
        //given
        //if we put a name in the expected than that would be the
        Double [] testScores = {97.0, 56.5,3.0};
        Student s = new Student("Surabhi", "Das",testScores);
        String expected = "Das";

        // When
        String actual = s.getLastName();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test

    public void testGetExamScores () {


        String expectedTest = "Exam Scores: \n\tExam 1 -> 10.00\n";
        Student s = new Student("Surabhi", "Das",new Double [] {10.0});

        String actualExam = s.getExamScores();

        Assert.assertEquals(expectedTest, actualExam);

    }

    @Test
    public void testGetNumOfExamsTaken () {

        int numOfExam = 2;
        Student s = new Student("Surabhi", "Das", new Double[]{10.0, 12.0});

        int actualNumOfExam = s.getNumberOfExamScores();

        Assert.assertEquals(numOfExam, actualNumOfExam);

    }
    @Test
    public void testGetAvgExamScore () {

        Double [] testScores = new Double [] {97.01, 56.51,3.01};
        Student s = new Student("Surabhi", "Das",testScores);

        double expectedAvg = (testScores[0]+testScores[1]+testScores[2])/testScores.length;

        double actualAvg = s.getAverageExamScore();
        //the last thing is 'delta' .. max diff allowed btwn expected and actual
        //for floating point comaprison? something about precison when comapring

        Assert.assertEquals(expectedAvg, actualAvg,0);
    }

    @Test
    public void testToString () {
        Double [] testScores = new Double [] {10.0, 10.0};
        Student s = new Student("Surabhi", "Das",testScores);

        String expectedToString = "Student Name: Surabhi Das\n" +
                "> Average Score: 10.00\n" +
                "> Exam Scores: \n" +
                "\tExam 1 -> 10.00\n" +
                "\tExam 2 -> 10.00\n";

        String actualToString = s.toString();

        Assert.assertEquals(expectedToString, actualToString);

    }


}