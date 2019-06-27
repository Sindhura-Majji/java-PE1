package com.stackroute.pe1;


public class Palindrome {

    public String CheckPalindrome(int num)
    {
        String result;
        int sum = 0, reminder, reverse = 0;
        int temp = num;
        while (num > 0) {
            reminder = num % 10;
            reverse = reverse * 10 + reminder;
            if ( reminder % 2 == 0)
                sum = sum + reminder;
            num = num / 10;
        }
        if (reverse == temp) {
            if (sum > 25) {
                result = reverse + " is palindrome and sum of even numbers is greater than 25";
            } else {
                result = reverse + " is palindrome and sum of even numbers is lesser than 25";
            }
        } else {
            result = "Not a palindrome";
        }
        return result;
    }
}
