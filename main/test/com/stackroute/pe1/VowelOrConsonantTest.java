package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsonantTest {
    VowelOrConsonant vowelorconsonant;
    @Before
    public void setUp() {
        System.out.println("Before");
        vowelorconsonant = new VowelOrConsonant();
    }

    @After
    public void tearDown()  {
        vowelorconsonant = null;
        System.out.println("After");
    }
    @Test
    public void givenStringContainsOneCharShouldReturnVowelMessage(){
        //Arrange
        //Act
        String result=vowelorconsonant.CheckVowelConsonant("e");
        //Assert
        assertEquals(" Vowel",result);
    }
    @Test
    public void givenStringContainsOneCharShouldReturnConsonantMessage(){
        //Arrange
        //Act
        String result=vowelorconsonant.CheckVowelConsonant("c");
        //Assert
        assertEquals(" Consonant",result);
    }
    @Test
    public void givenStringContainsMoreCharShouldReturnVowelConsonantMessage(){
        //Arrange
        //Act
        String result=vowelorconsonant.CheckVowelConsonant("ace");
        //Assert
        assertEquals(" Vowel Consonant Vowel",result);
    }
    @Test
    public void givenStringContainsOneNumShouldReturnErrorMessage(){
        //Arrange
        //Act
        String result=vowelorconsonant.CheckVowelConsonant("5");
        //Assert
        assertEquals(" Not a Character",result);
    }
}