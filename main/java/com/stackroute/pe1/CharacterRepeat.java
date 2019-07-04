package com.stackroute.pe1;

public class CharacterRepeat {

    public String repeatCharacters(String str,int number){
        String result ="", result1 ="";

        if(str.equals(" "))
        {
            result =  "Empty string";
        }

        else {
            for (int i = 0; i < number; i++) {
                result1 += str.substring(str.length() - number);
                result = str + result1;

            }
        }
        return result;
    }
}