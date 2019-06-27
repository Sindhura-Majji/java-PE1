package com.stackroute.pe1;
import java.util.Scanner;

public class CharacterRepeat {

    public String repeat(String str,int number){
        if(str==" "){
            return "Empty string";
        }

        String result ="", result1 ="";
        for(int i=0;i<number;i++) {
            result1 += str.substring(str.length() - number);
            result=str+result1;
        } return result ;
    }
}