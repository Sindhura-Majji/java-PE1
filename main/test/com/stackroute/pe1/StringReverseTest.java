package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringreverse;

    @Before
    public void setUp() {
        System.out.println("Before");
        stringreverse = new StringReverse();

    }

    @After
    public void tearDown() {
        stringreverse = null;
        System.out.println("After");
    }

    @Test
        public void givenStringContainsStringShouldReturnReverseString(){
            //Arrange
            //Act
            String reverse = stringreverse.ReverseString("sindhu");
            //Assert
            assertEquals("uhdnis", reverse);


        }
    @Test
    public void givenStringContainsEmptyShouldReturnErrorMessage(){
        //Arrange
        //Act
        String reverse = stringreverse.ReverseString(" ");
        //Assert
        assertEquals("Null not allowed", reverse);
    }
    @Test
    public void givenStringContainsNumericStringShouldReverseString(){
        //Arrange
        //Act
        String reverse = stringreverse.ReverseString("123");
        //Assert
        assertEquals("321", reverse);


    }
}