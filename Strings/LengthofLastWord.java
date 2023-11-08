// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

package Strings;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        char[] c = s.toCharArray();
        int count = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] != ' ') {
                count++;
            }
            if (count > 0 && c[i] == ' ') {
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

}
