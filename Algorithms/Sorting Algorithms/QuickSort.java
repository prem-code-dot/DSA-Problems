public class QuickSort {
    public static void sort(int [] arr, int n) {
        sort(arr, 0, n-1);
    }
    
    private static void sort(int[] arr, int low, int high) {
		if(low<high)
		{
			int pivot = partition(arr, low, high);
			sort(arr, low, pivot-1);
			sort(arr, pivot+1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low-1;
		for (int j =low; j < high ; j++) {
			if(arr[j] <= pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}


	public static void main(String[] args) {
    	int arr[] = {10, 9, 1, 5, 0, 8};
    	int n = arr.length;
    	sort(arr, n);
    	System.out.print("Sorted array: ");
    	for (int i : arr) {
			System.out.print(i + " ");
		}

        

    }
}