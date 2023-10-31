// Sort Integers by The Number of 1 Bits

package Array;

import java.util.Arrays;
import java.util.Comparator;

public class SortEleByNoOf1Bit {
    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                Integer c1 = Integer.bitCount(num1);
                Integer c2 = Integer.bitCount(num2);
                if (c1 == c2)
                    return Integer.compare(num1, num2);
                else
                    return Integer.compare(c1, c2);
            }
        });

        for (int i : arr) {
            System.out.println(i);
        }
    }
}