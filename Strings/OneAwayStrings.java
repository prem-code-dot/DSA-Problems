// Check Wheather two strings are one away or not from each other ?
// They are One Away if a single operation (changing a char, deleting a char or adding a char) will
// change one of the string to other.

package Strings;

public class OneAwayStrings {
    public static void main(String[] args) {
        String s1 = "bc";
        String s2 = "abc";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int n = arr1.length;
        int m = arr2.length;

        // If string lengths are same & only one char is different
        if (n == m) {
            int counter = 0;
            for (int i = 0; i < n; i++) {
                if (arr1[i] != arr2[i]) {
                    counter++;
                }
            }

            if (counter > 1) {
                System.out.println("Not One Away");
            } else
                System.out.println("One Away");
        }

        // If String lengths are not same, difference is one & either of the string is substring of another
        else {
            if (Math.abs(n - m) == 1 && ((s1.indexOf(s2) != -1) || (s2.indexOf(s1) != -1))) {
                System.out.println("one Away");
            } else
                System.out.println("Not One Away");
        }
    }
}
