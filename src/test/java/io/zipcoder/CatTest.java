package io.zipcoder;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void speakTest(){
        //Given
        Cat cat = new Cat("Davis", 10);

        //When
        String actual = cat.speak();

        //Then
        String expected = "Meow!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        //Given
        Cat cat = new Cat("Davis", 10);

        //When
        cat.setName("Tishka");
        String actual = cat.getName();

        //Then
        String expected = "Tishka";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest(){
        //Given
        Cat cat = new Cat("Davis", 10);

        //When
        cat.setAge(5);
        Integer actual = cat.getAge();

        //Then
        Integer expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getInheritanceTest(){
        //Given
        Cat cat = new Cat("Davis", 10);

        //Then
        Assert.assertTrue(cat instanceof Pet);
    }
}
