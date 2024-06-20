package org.example;

import java.util.Arrays;

public class Selection_Sort_on_Array {
    public static void main(String[] args) {
        int[] array = {4, 1, 2, 8, 7, 2, 9};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
