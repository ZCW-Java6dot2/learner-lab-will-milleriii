package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor professor = new Instructor("Professor");
        Assert.assertTrue(professor instanceof  Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor professor = new Instructor("Professor");
        Assert.assertTrue(professor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor professor = new Instructor("Professor");
        Student will = new Student("Will");
        Double expNumberOfHours = 5.0;

        professor.teach(will, expNumberOfHours);

        Assert.assertEquals(expNumberOfHours, will.getTotalStudyTime());
    }

}
