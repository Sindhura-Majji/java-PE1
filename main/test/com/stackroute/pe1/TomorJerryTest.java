package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomorJerryTest {
    TomorJerry tomorjerry;
    @Before
    public void setUp(){
        System.out.println("Before");
        tomorjerry = new TomorJerry();
    }

    @After
    public void tearDown(){
        System.out.println("After");
        tomorjerry = null;
    }
    @Test
    public void givenStringContainsOddIntegerShouldReturnTom(){
//Arrange
//Act
        String result = tomorjerry.odd(21);
//Assert
        assertEquals("Tom", result);
    }
    @Test
    public void givenStringContainsEvenIntegerShouldReturnJerry(){
//Arrange
//Act
        String result = tomorjerry.odd(26);
//Assert
        assertEquals("Jerry", result);
    }
    @Test
    public void givenStringContainsIntegerShouldReturnErrorMessage(){
//Arrange
//Act
        String result = tomorjerry.odd(11);
//Assert
        assertEquals("Number is not there between 20 to 30", result);
    }

}