package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessedNumberTest {

    GuessedNumber guessedNumber;
    @Before
    public void setUp(){
        guessedNumber = new GuessedNumber();
    }

    @After
    public void tearDown(){
        guessedNumber = null;
    }
    @Test
    public void givenStringContainsTwoIntegersShouldReturnMatch(){
    //Arrange
    //Act
        String result = guessedNumber.find(22, 22);
    //Assert
        assertEquals( "Number guessed matches original number", result);
    }
    @Test
    public void givenStringContainsTwoIntegersShouldReturnLesser(){
    //Arrange
    //Act
        String result = guessedNumber.find(50, 84);
    //Assert
        assertEquals( "Number guessed is less than the original number", result);
    }
    @Test
    public void givenStringContainsTwoIntegersShouldReturnGreater(){
    //Arrange
    //Act
        String result = guessedNumber.find(60 , 24);
    //Assert
        assertEquals( "Number guessed is more than the original number", result);
    }

}