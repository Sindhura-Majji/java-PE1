package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterRepeatTest {
    CharacterRepeat characterRepeat;
    @Before
    public void setUp() {
        System.out.println("Before");
        characterRepeat= new CharacterRepeat();
    }

    @After
    public void tearDown() {
        characterRepeat = null;
        System.out.println("After");
    }
    @Test
    public void givenStringContainsNumbersShouldReturnString(){
//Arrange
//Act
        String result = characterRepeat.repeat("stackroute", 3);
//Assert
        assertEquals( "stackrouteuteuteute", result);
    }
    @Test
    public void givenStringContainsStringShouldReturnString(){
//Arrange
//Act
        String result = characterRepeat.repeat("bangalore", 3);
//Assert
        assertEquals( "bangaloreoreoreore", result);
    }
    @Test
    public void givenStringContainsEmptyStringShouldReturnErrorMessage(){
//Arrange
//Act
        String result = characterRepeat.repeat(" ", 3);
//Assert
        assertEquals( "Empty string", result);
    }

}