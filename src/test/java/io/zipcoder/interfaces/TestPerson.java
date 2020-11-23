package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        String expectedName = "Will";

        Person will = new Person(expectedName);

        Assert.assertEquals(expectedName, will.getName());
    }

    @Test
    public void testSetName(){
        String expectedName = "Will";

        Person will = new Person(expectedName);
        String actualName = "Miller";

        will.setName(actualName);

        Assert.assertEquals(actualName, will.getName());
    }


}
