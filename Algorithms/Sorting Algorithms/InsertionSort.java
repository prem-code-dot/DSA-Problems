public class InsertionSort {
	public static void sort(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int k = 0;
			for (int j = i-1; j >=0 ; j--) {
				if(arr[j]>key)
				{
					arr[j+1] = arr[j];
					k++;
				}
			}
			arr[i-k] = key;
			
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {8, 9, 7, 2 ,6, 1};
		int n = arr.length;
		sort(arr, n);
		System.out.print("Sorted array is: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
