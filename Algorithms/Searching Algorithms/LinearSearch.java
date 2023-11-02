class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        int find = 7;
        for (int i = 0; i < n; i++) {
            if (arr[i] == find) {
                System.out.println("Element found at " + i);
                break;
            }
        }

    }
}
