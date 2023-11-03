public class MergeSort {
	public static void main(String[] args)
	{
		int arr[] = {10, 9, 5, 1, 6, 7};
		divide(arr);
		System.out.print("Sorted array: ");
		for (int i : arr) {
			System.out.print(i +" ");
		}
	}

	private static void divide(int[] arr) {
		if(arr.length<=1)
		{
			return;
		}
		int mid = arr.length/2;
		
		int[] left = new int[mid];
		int[] right = new int[arr.length-mid];
		
		System.arraycopy(arr, 0, left, 0, mid);
		System.arraycopy(arr, mid, right, 0, arr.length-mid);
		
		divide(left);
		divide(right);
		merge(arr, left, right);		
		
	}

	private static void merge(int[] arr, int[] left, int[] right) {
		int i=0; // for left array index
		int j =0; // for right array index
		int k =0; // for original array index
		
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
			{
				arr[k] = left[i];
				i++;
			}
			else
			{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<left.length)
		{
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			arr[k] = right[j];
			j++;
			k++;			
		}
	}
}
