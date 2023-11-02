class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 4, 3, 6, 8, 7 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
