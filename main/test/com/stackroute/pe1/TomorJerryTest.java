package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomorJerryTest {
    TomorJerry tomorjerry;
    @Before
    public void setUp(){
        tomorjerry = new TomorJerry();
    }

    @After
    public void tearDown(){
        tomorjerry = null;
    }
    @Test
    public void givenStringContainsOddIntegerShouldReturnTom(){
//Arrange
//Act
        String result = tomorjerry.oddOrEven(21);
//Assert
        assertEquals("Tom", result);
    }
    @Test
    public void givenStringContainsEvenIntegerShouldReturnJerry(){
//Arrange
//Act
        String result = tomorjerry.oddOrEven(26);
//Assert
        assertEquals("Jerry", result);
    }
    @Test
    public void givenStringContainsIntegerShouldReturnErrorMessage(){
//Arrange
//Act
        String result = tomorjerry.oddOrEven(11);
//Assert
        assertEquals("Number is not there between 20 to 30", result);
    }

}