package com.stackroute.pe1;

public class Total {

    public String total(String number)//Method to add numbers in array
    {
        int sum = 0;

        String string = "", result="";
        String[] array = number.split(" ");
        int arr[] = new int[array.length];
        try {
            for (int i = 0; i < array.length; i++) {
                arr[i] = Integer.parseInt(array[i]);

            }
        } catch (Exception exception) {
            return  "Character or null value not accepted";
        }
            for (int i = 0; i < array.length; i++) {
                sum = arr[i] + sum;

            }
            result = "" + sum;
            return result;
        }
}