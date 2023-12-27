package Array;

import java.util.Arrays;
import java.util.Comparator;

public class MaxUnits {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingInt((int[] arr) -> arr[1]).reversed()); // this will sort
        // array based on values in the 2nd column
        // System.out.println(boxTypes[0][1]);
        // System.out.println(boxTypes[1][1]);
        // System.out.println(boxTypes[2][1]);
        int count = 0; // to keep track of loaded boxes in truck
        int sum = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            for (int j = 1; j <= boxTypes[i][0]; j++) {
                if(count<truckSize)
                {
                    sum += 1*boxTypes[i][1];
                    count++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // int [][] boxTypes = {
        // {1,3},
        // {2,2},
        // {3,1}
        // };
        // int[][] boxTypes = { { 5, 4 }, { 2, 2 }, { 3, 1 } };
        int[][] boxTypes = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9} };
        int truckSize = 10;

        int ans = maximumUnits(boxTypes, truckSize);
        System.out.println(ans);
    }
}