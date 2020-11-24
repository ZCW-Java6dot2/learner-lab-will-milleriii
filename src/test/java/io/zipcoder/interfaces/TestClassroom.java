package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestClassroom {
    Classroom classroom;
    @Before
    public void setup(){
        classroom = new Classroom();
    }

    @Test
    public void ClassroomTest(){
        ArrayList<Person> school = new ArrayList<Person>();
        school.addAll(TechConnect.getStudents());
        school.addAll(ZipCodeWilmington.getInstructors());

        for (Person p: classroom.getRoster().values()){
            Assert.assertTrue(school.contains(p));
        }
    }

}
