package Array;

import java.util.Scanner;

public class PalindromeUsingRecurssion {
    public static boolean palindrome(int x)
    {
        if(x<0)
        {
            return false;
        }
        return subPalindrome(x, x);
    }

    public static boolean subPalindrome(int original, int copy)
    {
        if(original == 0)
        {
            return original== copy;
        }

        int copyRem = copy %10;
        int originalRem = original %10;
        return copyRem == originalRem && subPalindrome(original/10, copy/10);
        
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
