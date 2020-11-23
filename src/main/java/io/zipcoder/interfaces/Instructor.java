package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{
    public Instructor(String name) {
        super(name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner i: learners){
            i.learn(numberOfHours / learners.length);
        }
    }
}
