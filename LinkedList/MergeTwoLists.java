// Merge two sorted LinkedList and return the header of sorted LinkedList

import java.util.LinkedList;

public class MergeTwoLists {
    public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> tmp = new LinkedList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) > list2.get(j)) {
                tmp.add(list2.get(j));
                j++;
            } else if (list1.get(i) < list2.get(j)) {
                tmp.add(list1.get(i));
                i++;
            } else {
                tmp.add(list1.get(i));
                tmp.add(list2.get(j));
                i++;
                j++;
            }
        }

        while (i < list1.size()) {
            tmp.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            tmp.add(list2.get(j));
            j++;
        }

        return tmp;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        list2.add(1);
        list2.add(3);
        list2.add(4);

        LinkedList<Integer> ans = new LinkedList<>();
        ans = mergeTwoLists(list1, list2);
        System.out.print("Sorted list is: ");
        for (Integer i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
