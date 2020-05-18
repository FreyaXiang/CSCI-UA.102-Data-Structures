public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] arr= {103,77,98,30,20,50,77,22,49,100};
		quickSort(arr, 0, arr.length-1);
		System.out.println(java.util.Arrays.toString(arr));
		
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		
		if (low<high) {
			int partitionIndex=partition(arr,low,high);
			quickSort(arr, low, partitionIndex-1);
			quickSort(arr,partitionIndex+1, high);
		}
		
	}
	
	public static int partition(int[] arr, int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for (int j=low; j<high;j++) {
			if (arr[j]<pivot) {
				
				//!!!!
				i++;
				
				//swap arr[i] and arr[j]
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//swap arr[i+1] and pivot
        arr[high] = arr[i+1]; 
        arr[i+1]=pivot;
		return i+1;
		
	}
}