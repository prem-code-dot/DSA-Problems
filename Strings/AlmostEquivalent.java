import java.util.HashMap;

public class AlmostEquivalent {
    public static boolean checkAlmostEquivalent(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], 1);
            } else {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!map2.containsKey(arr2[i])) {
                map2.put(arr2[i], 1);
            } else {
                map2.put(arr2[i], map2.get(arr2[i]) + 1);
            }
        }

        boolean flag = true;

        for (char c : map.keySet()) {
            int f1 = map.getOrDefault(c, 0);
            int f2 = map2.getOrDefault(c, 0);
            int diff = Math.abs(f1 - f2);

            if (diff > 3) {
                flag = false;
            }
        }

        for (char c : map2.keySet()) {
            int f1 = map.getOrDefault(c, 0);
            int f2 = map2.getOrDefault(c, 0);
            int diff = Math.abs(f1 - f2);

            if (diff > 3) {
                flag = false;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        String w = "zzzyyy";
        String w2 = "iiiiii";

        boolean ans = checkAlmostEquivalent(w, w2);
        System.out.println(ans);
    }
}
