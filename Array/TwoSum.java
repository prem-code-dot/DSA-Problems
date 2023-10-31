// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int arr[] = new int[] {2, 7, 15, 15};
        int target = 30;
        System.err.println("length: " + arr.length);

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            int diff = target - arr[i];
            if(map.containsKey(diff))
            {
                System.out.println(map.get(diff) + ", " + i);
                return;
            }
            else
                map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two element can add up to target");
    }

}
