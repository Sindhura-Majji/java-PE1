package com.stackroute.pe1;

import java.util.Scanner;

public class Character {

        public String DisplayType(char character){

            String result="";
        if(character >= 'a' && character <= 'z')
        {
            result = "Small Letter";
        }
        else if(character >= 'A' && character <= 'Z')
        {
            result = "Capital Letter";
        }
        else if(character >= '0' && character <= '9')
        {
            result = "Digit";
        }
        else
        {
            result = "Special Character";
        }
        return result;
    }
}
