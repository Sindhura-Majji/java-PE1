package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterRepeatTest {
    CharacterRepeat characterRepeat;
    @Before
    public void setUp() {
        characterRepeat= new CharacterRepeat();
    }

    @After
    public void tearDown() {
        characterRepeat = null;
    }
    @Test
    public void givenStringContainsNumbersShouldReturnString(){
    //Arrange
    //Act
        String result = characterRepeat.repeatCharacters("stackroute", 3);
    //Assert
        assertEquals( "stackrouteuteuteute", result);
    }
    @Test
    public void givenStringContainsStringShouldReturnString(){
    //Arrange
    //Act
        String result = characterRepeat.repeatCharacters("bangalore", 3);
    //Assert
        assertEquals( "bangaloreoreoreore", result);
    }
    @Test
    public void givenStringContainsEmptyStringShouldReturnErrorMessage(){
    //Arrange
    //Act
        String result = characterRepeat.repeatCharacters(" ", 3);
    //Assert
        assertEquals( "Empty string", result);
    }
}