package org.example;

import java.util.Arrays;

//Find Largest and Smallest Number in array using Brute Force method
public class Find_Largest_and_Smallest_Number_In_Array {
    public static void main(String[] args) {
        int[] arr = {1,44,2,78,45,90,4,6};
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Largest Number : " + max + "\n" + "Smallest Number: " + min);

    }
}
