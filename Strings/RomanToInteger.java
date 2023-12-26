// Given a roman numeral, convert it to an integer.

import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();

        int ans = map.get(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                ans = ans - map.get(s.charAt(i));
            } else
                ans += map.get(s.charAt(i));
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int n = romanToInt(s);
        System.out.println(n);
    }

}
