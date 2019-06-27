package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalTest {

    Total total;
    @Before
    public void setUp() {
        System.out.println("Before");
        total = new Total();
    }

    @After
    public void tearDown() {
        total= null;
        System.out.println("Aftre");
    }
    @Test
    public void givenOneStringShouldReturnSum() {
//arrange

//Act
        String result= total.total("12 23 4 2");

//Assert
        assertEquals("41", result);

    }
    @Test
    public void givenOneStringShouldReturnError() {
//arrange

//Act
        String result= total.total("23 4 p");

//Assert
        assertEquals("Error", result);

    }
    @Test
    public void givenNullShouldReturnError() {
//arrange

//Act
        String result= total.total("null");

//Assert
        assertEquals("Error", result);

    }

}