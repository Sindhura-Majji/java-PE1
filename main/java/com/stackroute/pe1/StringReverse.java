package com.stackroute.pe1;


public class StringReverse
{
        public String ReverseString( String original){

        String reverse = "";
        int length = original.length();
        if(original == " ") {
            reverse= "Empty String not allowed";
        }
        for (int i = length - 1 ; i >= 0 ; i--)
        {
            reverse = reverse + original.charAt(i);
        }

            return reverse.trim();
        }
    }