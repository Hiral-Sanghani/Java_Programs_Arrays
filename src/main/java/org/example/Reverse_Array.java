package org.example;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {2,1,4,6,7,12,45,3};
        int length = arr.length;
        int temp;

        System.out.println("Original Array: " + Arrays.toString(arr));
        for(int i = 0; i < length/2; i++) {
            temp = arr[i];
            arr[i] = arr[length-1-i];
            arr[length-1-i] = temp;
        }

        System.out.println("Array: " + Arrays.toString(arr));
    }
}
