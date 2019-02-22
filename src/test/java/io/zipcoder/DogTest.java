package io.zipcoder;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speakTest() {
        //Given
        Dog dog = new Dog("Davis", 10);

        //When
        String actual = dog.speak();

        //Then
        String expected = "Woof!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        //Given
        Dog dog = new Dog("Davis", 10);

        //When
        dog.setName("Fido");
        String actual = dog.getName();

        //Then
        String expected = "Fido";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest(){
        //Given
        Dog dog = new Dog("Davis", 10);

        //When
        dog.setAge(5);
        Integer actual = dog.getAge();

        //Then
        Integer expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getInheritanceTest(){
        //Given
        Dog dog = new Dog("Davis", 10);

        //Then
        Assert.assertTrue(dog instanceof Pet);
    }
}
