package com.stackroute.pe1;

import java.util.Scanner;
public class TomorJerry {
    public String odd(int number){
        String result=null;
        if(number % 2 !=0 &&(number >20 && number <30)){
            result="Tom";
        }else if(number % 2 == 0 &&(number >20 && number<30)){
            result = "Jerry";
        }else {
            return "Number is not there between 20 to 30";
        }
        return result;
    }
}