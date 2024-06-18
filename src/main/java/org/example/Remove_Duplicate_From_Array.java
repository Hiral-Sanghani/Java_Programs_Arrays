package org.example;

import java.util.ArrayList;

public class Remove_Duplicate_From_Array {
    public static void main(String[] args) {
        int[] arr = {1, 90, 2, 5, 1, 4, 3, 4, 9, 4};

        ArrayList<Integer> finalArray = new ArrayList<>();

        for (int a : arr) {
            if (!finalArray.contains(a)) {
                finalArray.add(a);
            }
        }
        System.out.println("Array : " + finalArray);
    }
}
