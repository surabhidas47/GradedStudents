package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetFirstName() {
        //given
        //if we put a name in the expected than that would be the
        Double [] testScores = {97.0, 56.5,3.0};
        Student s = new Student("Surabhi", "Das",testScores);
        String expected = "Surabhi";


        // When
        String actual = s.getFirstName();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetFirstName() {
        //given
        //if we put a name in the expected than that would be the
        Double [] testScores = {97.0, 56.5,3.0};
        Student s = new Student("Surabhi", "Das",testScores);
        String expected = "Surabhi";

        // When
        String actual = s.getFirstName();

        //Then
        Assert.assertEquals(expected, actual);

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
    public void testSetLastName() {
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
    public void testGetExamScore() {


    }


}