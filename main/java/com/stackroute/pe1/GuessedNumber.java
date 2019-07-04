package com.stackroute.pe1;

public class GuessedNumber {

    public String find(int guess, int target){

        String string="";
        if(target > guess){
            string = "Number guessed is less than the original number";
        }else if (target == guess){
            string = "Number guessed matches original number";
        }else if(target < guess){
            string = "Number guessed is more than the original number";
        }
        else{
            string="Error";
        }
        return string;
    }
}