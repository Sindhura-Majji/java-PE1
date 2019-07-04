package com.stackroute.pe1;

public class NumberSeries
{
    public String iterationNumbers(int number) {
        String str = "";
        if (number < 1) {
            str= "Zero and negative numbers are not allowed";
        } else {

            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {
                    str = str + i;
                }
            }
        }return str;

    }
}
