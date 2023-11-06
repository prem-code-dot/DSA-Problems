// Remove Duplicates from Sorted Array
// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.

package Array;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int j = 0;
        for (Integer k : set) {
            nums[j] = k;
            j++;
        }

        return set.size();
    }

    public static void main(String[] args) {
        int nums[] = new int[] { -3, -1, 0, 0, 0, 3, 3 };
        System.out.println(removeDuplicates(nums));
        System.out.println();
    }
}
