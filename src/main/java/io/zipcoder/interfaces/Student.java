package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(String name) {
        super(name);
     }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }



    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
