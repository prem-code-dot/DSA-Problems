import java.util.Scanner;

public class BinarySearch {
    public static void BinarySearch(int[] arr, int n, int find, int low, int high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == find) {
            System.out.println("Element found at index " + mid);
            return;
        } else if (arr[mid] > find) {
            BinarySearch(arr, n, find, low, mid - 1);
        } else
            BinarySearch(arr, n, find, mid + 1, high);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            System.out.print("Enter the elements of array: ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the Element to find : ");
            int find = sc.nextInt();
            int high = n - 1, low = 0;

            BinarySearch(arr, n, find, low, high);
        }
    }
}
