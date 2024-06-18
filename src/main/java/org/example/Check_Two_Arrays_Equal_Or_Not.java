package org.example;

public class Check_Two_Arrays_Equal_Or_Not {

    public static void main(String[] a) {
        int[] arr = {98, 22, 1, 6, 43};
        int[] arr1 = {98, 22, 21, 32, 6, 43};

        boolean equal = true;
        if (arr.length == arr1.length) {
            for (int i = 0; i < arr.length; i++) {
                if (!(arr[i] == arr1[i])) {
                    equal = false;
                    break;
                }
            }
        } else {
            equal = false;
        }

        if (equal) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
