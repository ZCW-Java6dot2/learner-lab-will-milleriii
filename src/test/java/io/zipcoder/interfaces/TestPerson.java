package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        String expectedName = "Will";
        long expectedId = 1;

        Person will = new Person(expectedId, expectedName);

        Assert.assertEquals(expectedId, will.getId());
        Assert.assertEquals(expectedName, will.getName());
    }

    @Test
    public void testSetName(){
        String expectedName = "Will";
        long expectedId = 1;

        Person will = new Person(expectedId, expectedName);
        String actualName = "Miller";

        will.setName(actualName);

        Assert.assertEquals(actualName, will.getName());
    }


}
