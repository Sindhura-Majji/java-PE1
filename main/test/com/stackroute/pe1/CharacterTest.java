package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {

    Character character;
    @org.junit.Before
    public void setUp() {
        System.out.println("Before");
        character = new Character();

    }

    @org.junit.After
    public void tearDown() {
        character= null;
        System.out.println("After");
    }
    @Test
        public void givenStringContainsSmallLetterShouldReturnSmallletterString(){
        //Arrange
        //Act
        String result = character.DisplayType('a');
        //Assert
        assertEquals("Small Letter", result);
    }
    @Test
    public void givenStringContainsCapitalLetterShouldReturnCapitalletterString(){
        //Arrange
        //Act
        String result = character.DisplayType('A');
        //Assert
        assertEquals("Capital Letter", result);
    }
    @Test
    public void givenStringContainsDigitShouldRetutnDigitString(){
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

}
