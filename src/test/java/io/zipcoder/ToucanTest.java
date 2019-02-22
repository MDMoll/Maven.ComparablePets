package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ToucanTest {

    @Test
    public void speakTest(){
        //Given
        Toucan toucan = new Toucan("Davis", 10);

        //When
        String actual = toucan.speak();

        //Then
        String expected = "Croak!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        //Given
        Toucan toucan = new Toucan("Davis", 10);

        //When
        toucan.setName("Sam");
        String actual = toucan.getName();

        //Then
        String expected = "Sam";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest(){
        //Given
        Toucan toucan = new Toucan("Davis", 10);

        //When
        toucan.setAge(5);
        Integer actual = toucan.getAge();

        //Then
        Integer expected = 5;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getInhertanceTest(){
        //Given
        Toucan toucan = new Toucan("Davis", 10);

        //Then
        Assert.assertTrue(toucan instanceof Pet);
    }
}
