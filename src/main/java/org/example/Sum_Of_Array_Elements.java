package org.example;

//To Find Sum of array elements
public class Sum_Of_Array_Elements {
    public static void main(String[] args) {
        int sum = 0;
        int average;
        int[] arr = new int[] {3,2,1};

        for(int a : arr) {
            sum = sum + a; // alternatively : sum+= a;
        }
        System.out.println("Sum : " + sum);

        average = sum / arr.length;

        System.out.println("Average : " + average);

    }
}
