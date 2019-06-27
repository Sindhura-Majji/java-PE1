package com.stackroute.pe1;

public class NumberSeries
{
    public String IterationNumbers(int number) {
        String str = "";
        if (number < 1) {
            return "error";
        } else {

            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {
                    str = str + i;
                }
            }
        }return str;

    }
}
