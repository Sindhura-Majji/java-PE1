package com.stackroute.pe1;

public class GuessedNumber {
    public static String find(int guess, int target){
        String string="";
        if(target > guess){
            string = "Number guessed is less than the original number";
            return string;
        }else if (target == guess){
            string = "Number guessed matches original number";
            return string;
        }else if(target < guess){
            string = "Number guessed is more than the original number";
            return string;
        }
        else{
            string="Error";
        }
        return string;
    }
}