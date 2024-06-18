package org.example;

import java.util.Arrays;

//Approach: sort array and find
public class Find_Second_Largest_and_Smallest_Number_In_Array {

    public static void main(String[] a) {
        int[] arr = {12, 11, 56, 3, 45, 1};
//        Arrays.sort(arr);

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Second Largest : " + arr[arr.length - 2] + "\n" +
                "Second Smallest : " + arr[1]);
    }
}
