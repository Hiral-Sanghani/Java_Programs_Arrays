package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Array_Declaration_Initialization {

    public static void main(String[] args) {

        int[] nums = new int[3]; // Declaration and Memory Allocation
        nums[0] = 2;
        nums[1] = 12;
        nums[2] = 1;

        int[] number = {43,21,56}; // Declaration and Initialization
        int[] numbers = new int[] {3,2,15,5}; // Declaration and Initialization

        System.out.println("Nums array : ");
        //traversing using for loop
        for(int i = 0; i< nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("numbers");
        //traversing using for-each loop
        for(int i: numbers) {
            System.out.println("i: " + i);
        }

    }
}