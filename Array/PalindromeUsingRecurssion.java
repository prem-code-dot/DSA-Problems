package Array;

import java.util.Scanner;

public class PalindromeUsingRecurssion {
    public static boolean palindrome(int x) {
        if (x < 0) {
            return false; // -ve numbers are not palindrome
        }
        int original = x;
        int rev = reverse(x, 0);
        return original == rev;
    }

    public static int reverse(int copy, int rev) {
        if (copy == 0) {
            return rev;
        }

        int rem = copy % 10;
        rev = (rev * 10) + rem;
        return reverse(copy / 10, rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome: ");
        int number = sc.nextInt();
        boolean ans = palindrome(number);
        System.out.println(ans);
        sc.close();
    }
}
