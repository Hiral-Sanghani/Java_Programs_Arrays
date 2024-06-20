package org.example;

import java.util.HashMap;
import java.util.Map;

public class Count_Frequency_of_Array_Elements {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 1, 9, 2};

        Map<Integer, Integer> storeFrequency = new HashMap<>();

        for (int a : arr) {
            if (!storeFrequency.containsKey(a)) {
                storeFrequency.put(a, 1);

            } else {
                storeFrequency.put(a, storeFrequency.get(a) + 1);
            }
        }

        System.out.println("Arrays Elements    Frequencies");
        for (Map.Entry<Integer, Integer> set : storeFrequency.entrySet()) {
            System.out.println("  " + set.getKey() + "  ------------     " + set.getValue());
        }
    }
}
