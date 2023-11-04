// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
// Constraint: strs[i] consists of only lowercase English letters.

package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); // sort in lexicographically manner and not length wise
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the numner of strings: ");
            int size = sc.nextInt();
            String[] s = new String[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter String no " + (i + 1) + " : ");
                s[i] = sc.next();
            }
            // String[] str = { "ba", "b" };

            String ans = longestCommonPrefix(s);
            System.out.println();
            System.out.println("Longest common string: " + ans);
            System.out.println();
        }
    }
}
