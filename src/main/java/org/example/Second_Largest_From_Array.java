package org.example;

public class Second_Largest_From_Array {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 2, 8, 7, 10, 23, 78, 66, 98};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int element : a) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (secondLargest < element && element != largest) {
                secondLargest = element;
            }
        }
        System.out.println("Second Largest : " + secondLargest);
    }
}

