//find the common elements in two sorted arrays

package Array;

import java.util.HashSet;
import java.util.Set;

public class commonElementsInTwoArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 3, 5, 6, 7, 8, 9 };
        int n = arr1.length;
        int m = arr2.length;

        // Brute force method O(n^2)
        System.out.print("Duplicate elements are: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
        System.out.println();

        // using HashSet: O(n) + O(n)
        Set<Integer> set = new HashSet<>();

        System.out.print("duplicate elements are: ");
        for (int i : arr1) {

            set.add(i);
        }
        for (int i : arr2) {
            if (set.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Optimized Solution O(n) + O(n)
        // This solution will only work if arrays are sorted
        System.out.print("Duplicate elements are: ");
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else
                i++;
        }

    }
}