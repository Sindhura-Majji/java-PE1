package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @org.junit.Before
    public void setUp() {
        palindrome = new Palindrome();

    }

    @org.junit.After
    public void tearDown() {
        palindrome= null;
    }
    @Test
    public void givenStringContainsLesserNumberShouldReturnPalindromeString(){
        //Arrange
        //Act
        String result = palindrome.checkPalindrome(454);
        //Assert
        assertEquals("454 is palindrome and sum of even numbers is lesser than 25", result);
    }
    @Test
    public void givenStringContainsGreaterNumberShouldReturnPalindromeString(){
        //Arrange
        //Act
        String result = palindrome.checkPalindrome(6789876);
        //Assert
        assertEquals("6789876 is palindrome and sum of even numbers is greater than 25", result);
    }
    @Test
    public void givenStringContainsNotPalindromeNumberShouldReturnNotPalindromeString(){
        //Arrange
        //Act
        String result = palindrome.checkPalindrome(123);
        //Assert
        assertEquals("Not a palindrome", result);
    }
}