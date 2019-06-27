package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSeriesTest {

    NumberSeries numberSeries;

    @Before
    public void setUp() {
        System.out.println("Before");
        numberSeries = new NumberSeries();
    }

    @After
    public void tearDown() {
        numberSeries = null;
        System.out.println("After");
    }

    @Test
    public void givenStringContainsNumbersShouldReturnNumberSeries() {
        //Arrange
        //Act
        String result = numberSeries.IterationNumbers(3);
        //Assert
        assertEquals("122333", result);
    }

    @Test
    public void givenStringContainsNumberShouldReturnErrorMessage() {
        //Arrange
        //Act
        String result = numberSeries.IterationNumbers(0);
        //Assert
        assertEquals("error", result);
    }
}