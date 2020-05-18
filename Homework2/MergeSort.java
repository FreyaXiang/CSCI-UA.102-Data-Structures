public class MergeSort {
	
	public static void main(String[] args) {
		int[] arr= {4,77,98,30,20,50,77,22,49,2};
		sort(arr, 0, arr.length-1);
		System.out.println(java.util.Arrays.toString(arr));
		
	}
	
	//assume left=0, right=arr.length-1
	public static void sort(int[] arr, int left, int right) {
		
		if (left<right) {
			int mid=(left+right)/2;
			sort(arr, left, mid);
			sort(arr,mid+1, right);
			mergeArrays(arr, left, mid, right);
			
		}
		
	}
	
	// assume the left half and right half are all sorted 
	// merge them
	public static void mergeArrays(int[] arr, int left, int mid, int right) {
		
		//create two new arrays
		int[] arr1=new int[mid-left+1];
		int[] arr2=new int[right-mid];
		
		// copy data from original array
		for (int i=0; i<arr1.length; i++) {
			arr1[i]=arr[left+i];
		}
		
		for (int j=0; j<arr2.length; j++) {
			arr2[j]=arr[mid+j+1];
		}
		
		
		
		int i=0, j=0, k=left;
		
		
		//merge
		while (i<arr1.length && j<arr2.length) {
			if (arr1[i]<arr2[j]) {
				arr[k++]=arr1[i++];
			} else {
				arr[k++]=arr2[j++];
			}
		}
		
		//the rest
		while (i<arr1.length) {
			arr[k++]=arr1[i++];
		}
		
		while (j<arr2.length) {
			arr[k++]=arr2[j++];
		} 
	}
}