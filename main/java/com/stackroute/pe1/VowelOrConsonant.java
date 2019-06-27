package com.stackroute.pe1;

import java.util.Scanner;

public class VowelOrConsonant {

        public String CheckVowelConsonant( String word){

            String result="";
        for (int i=0 ; i<word.length(); i++){
            char letter = word.charAt(i);
            if(letter == 'a'|| letter == 'e'|| letter == 'i' || letter == 'o' || letter == 'u'|| letter == ' ') {
                result += " Vowel";
            }
            else if((letter > 'a' && letter < 'z') || (letter > 'A' &&  letter < 'Z')) {
                result += " Consonant";
            }
            else {
                result += " Not a Character";
            }
        }return result;

    }
}
