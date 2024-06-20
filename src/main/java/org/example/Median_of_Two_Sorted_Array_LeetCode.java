package org.example;

import java.util.Arrays;

public class Median_of_Two_Sorted_Array_LeetCode {

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println("Median : " + findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arraySize = nums1.length + nums2.length;
        int[] merged = new int[arraySize];
        int mid;

        int i = 0;
        for (int a : nums1) {
            merged[i++] = a;
        }
        for (int a : nums2) {
            merged[i++] = a;
        }
        Arrays.sort(merged);

        double median = 0.0;
        if (arraySize % 2 == 0) {
            mid = arraySize / 2; // 4/2   =2
            System.out.println("Midle : " + mid + "....mid1... " + merged[mid] + "....mid2... " + merged[mid - 1]);

            median = (merged[mid] + merged[mid - 1]) / 2.0;
        }
        return median;
    }
}