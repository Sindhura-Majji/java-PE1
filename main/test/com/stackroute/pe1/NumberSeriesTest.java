package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSeriesTest {

    NumberSeries numberSeries;

    @Before
    public void setUp() {
        numberSeries = new NumberSeries();
    }

    @After
    public void tearDown() {
        numberSeries = null;
    }

    @Test
    public void givenStringContainsNumbersShouldReturnNumberSeries() {
        //Arrange
        //Act
        String result = numberSeries.iterationNumbers(3);
        //Assert
        assertEquals("122333", result);
    }

    @Test
    public void givenStringContainsNumberShouldReturnErrorMessage() {
        //Arrange
        //Act
        String result = numberSeries.iterationNumbers(0);
        //Assert
        assertEquals("Zero and negative numbers are not allowed", result);
    }
    @Test
    public void givenStringContainsNegativeNumberShouldReturnErrorMessage() {
        //Arrange
        //Act
        String result = numberSeries.iterationNumbers(-2);
        //Assert
        assertEquals("Zero and negative numbers are not allowed", result);
    }
}