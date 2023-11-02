import java.util.Scanner;

public class BubbleSort {
    public static int[] sort(int [] arr, int n) {
        for(int i=0; i<n; i++)
        {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
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

            sort(arr, n);

            System.err.print("Sorted array: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }

        }

    }
}
