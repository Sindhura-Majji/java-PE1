package com.stackroute.pe1;
// method to sort an unordered to non-ascending order and calculate the sum of even numbers
public class Sorting {

    public static String sortingList(int[] array) {
        int i, j, swap;
        int sum = 0;
        String s;
        int n = array.length;
        for (i = 0; i < n - 1; i++) {//sorting
            for (j = i; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                } else if (array[j] == array[j + 1]) {
                    array[j] = array[j];
                    array[j + 1] = array[j + 1];
                }

            }
        }

        s = "sorted list of elements";
        for (i = n - 1; i >= 0; i--)//sorting
            System.out.println(array[i]);
        System.out.println();
        for (i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        s = "sum of the even numbers is" + sum;//calculating the sum
        if (sum > 15) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return s;
    }
}