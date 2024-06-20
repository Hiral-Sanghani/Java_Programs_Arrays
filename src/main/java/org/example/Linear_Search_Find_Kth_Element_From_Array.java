package org.example;

//Linear Search Algorithm
public class Linear_Search_Find_Kth_Element_From_Array {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1,3,29,10,39};
        boolean isFound = false;
        for(int element: arr) {
            if(k == element) {
                isFound = true;
                break;
            }
        }
        if(isFound) {
            System.out.println("Element : " + k + " is found");
        } else {
            System.out.println("Element : " + k + " is not found");
        }
    }
}
