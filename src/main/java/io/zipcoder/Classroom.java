package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {

    private Student[] pupils;

    public Classroom(Student [] pupils) {
        this.pupils =pupils;
    }

    public Classroom(int maxNumbersOfStudents){
        this.pupils = new Student[maxNumbersOfStudents];

    }

    public Classroom () {
        this.pupils = new Student[30];
    }

    public Student [] getPupils () {
        return pupils;
    }

    public Double getAverageExamScore () {
        Double sum =0.0;

        for (Student student:pupils){
            sum += student.getAverageExamScore();

        }
        return sum/ pupils.length;
    }

    public void addStudent (Student student) {
        ArrayList<Student> arrayList = new ArrayList<>(Arrays.asList(pupils));
        arrayList.add(student);
        Student [] updatedArr = arrayList.toArray(new Student[0]);
    }

}

