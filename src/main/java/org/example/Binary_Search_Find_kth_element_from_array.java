package org.example;

//Binary_Search
//array should be sorted
public class Binary_Search_Find_kth_element_from_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int elem = 6;
        int low = 0, high = arr.length - 1;
        boolean isFound = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == elem) {
                isFound = true;
                break;
            } else if (elem < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (isFound) {
            System.out.println("Element : " + elem + " is found");
        } else {
            System.out.println("Element : " + elem + " is not found");
        }
    }
}
