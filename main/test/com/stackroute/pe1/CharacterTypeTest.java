package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTypeTest {

    CharacterType character;

    @org.junit.Before
    public void setUp()
    {
        character = new CharacterType();

    }

    @org.junit.After
    public void tearDown()
    {
        character= null;
    }
    @Test
        public void givenStringContainsSmallLetterShouldReturnSmallLetterString(){
        //Arrange
        //Act
        String result = character.DisplayType('a');
        //Assert
        assertEquals("Small Letter", result);
    }
    @Test
    public void givenStringContainsCapitalLetterShouldReturnCapitalLetterString(){
        //Arrange
        //Act
        String result = character.DisplayType('A');
        //Assert
        assertEquals("Capital Letter", result);
    }
    @Test
    public void givenStringContainsDigitShouldReturnDigitString(){
        //Arrange
        //Act
        String result = character.DisplayType('5');
        //Assert
        assertEquals("Digit", result);
    }
    @Test
    public void givenStringContainsSpecialCharacterShouldReturnSpecialCharacterString(){
        //Arrange
        //Act
        String result = character.DisplayType('#');
        //Assert
        assertEquals("Special Character", result);
    }
    @Test
    public void givenStringContainsEmptyCharacterShouldReturnErrorMessage(){
        //Arrange
        //Act
        String result = character.DisplayType(' ');
        //Assert
        assertEquals("Empty character not allowed", result);
    }

}
