// Find Most frequently occuring Element in an Array (java) 

package Array;

import java.util.HashMap;

public class MostFrequentlyOccuringElementInArray {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 3, 4, 5, 5, 5 };
        int n = arr.length;
        int maxCount = 0;
        int element = arr[0];

        // Brute Force method O(n^2)

        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    ++count;
                    if (maxCount < count) {
                        maxCount = count;
                        element = arr[i];
                    }
                }
            }
        }

        // Using another array
        // Time complexity: O(n) & Space Complexity: O(n)

        int arr2[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr2[arr[i]] = arr2[arr[i]] + 1;
        }

        for (int i = 0; i < n; i++) {
            if (arr2[i] > maxCount) {
                maxCount = arr2[i];
                element = i;
            }
        }

        // using Hashmap O()
        // Time Complexity: O(n) & Space Complexity: O(n)

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(arr[i], map.get(i) + 1);

                if (maxCount < map.get(i)) {
                    maxCount = map.get(i);
                    element = i;
                }
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println("Most Occuring element is: " + element);
        System.out.println("Frequency is: " + maxCount);
        System.out.println();

    }
}