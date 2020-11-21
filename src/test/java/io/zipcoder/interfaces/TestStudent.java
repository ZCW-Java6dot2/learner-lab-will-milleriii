package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student will = new Student(1, "Will");
        Assert.assertTrue(will instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student will = new Student(1, "Will");
        Assert.assertTrue(will instanceof Person);
    }

    @Test
    public void testLearn(){
        Student will = new Student(1, "Will");
        Double expNumberOfHours = 10.00;

        will.learn(expNumberOfHours);

        Assert.assertEquals(expNumberOfHours, will.getTotalStudyTime());
    }
}
