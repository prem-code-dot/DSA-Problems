//  28. Find the Index of the First Occurrence in a String
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

package Strings;

public class FindIndexInString {
    public static int strStr(String haystack, String needle) {
        int ans = (-1);
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for(int i = 0; i<=haystack.length()-needle.length(); i++)
        {
            if(haystack.equals(needle) )
            {
                return 0;
            }
            else if (haystack.substring(i, i + needle.length()).equals(needle))
            {
                return i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "abc";
        String s = "c";
        int result = strStr(str, s);
        System.out.println(result);
    }
}
