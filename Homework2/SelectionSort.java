public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr= {4,77,98,30,20,50,77,22,49,2};
		selectionSort(arr);
		System.out.println(java.util.Arrays.toString(arr));
		
	}
	
	public static void selectionSort(int[] arr) {
		
		for (int i=0; i<arr.length-1; i++) {
			
			int minIndex=i;
			
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			
			//swap
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			System.out.println(java.util.Arrays.toString(arr));
		}
	}
}