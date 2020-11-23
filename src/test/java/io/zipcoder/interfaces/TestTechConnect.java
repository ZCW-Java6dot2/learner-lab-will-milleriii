package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestTechConnect {

    @Before
    public void setup(){
        TechConnect.removeStudents();
    }

    @Test
    public void testRemoveStudents(){
        ArrayList<Student> testList = new ArrayList<Student>();
        Assert.assertTrue(TechConnect.getStudents().isEmpty());
    }

    @Test
    public void testRecruitStudent(){
        String[] studentNames = { "Karen", "Liel", "Quinn", "Destiny", "Blesson", "Danielle B.", "Andre", "Jeff",
                "Carlo", "Julia D.", "Natalie", "Julia E.", "Shylee", "Genevieve", "Margo", "Whitney", "Rachel",
                "Bridget", "Seung", "Jessica", "Harry", "Kesler", "Darin", "Jade", "Dominika", "Nashae", "Brianna",
                "Laurent", "Rina", "Emily", "Elisha", "Caitlin", "Kierra", "Dana", "Alyssa", "Humaira", "Prajwal",
                "Cristine",  "Brendan" };
        for (String studentName : studentNames) {
            Student student = new Student(studentName);
            TechConnect.getStudents().add(student);
        }

        Assert.assertEquals(TechConnect.getStudents().size(), 39);

    }
}
