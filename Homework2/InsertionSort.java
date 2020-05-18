public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr= {4,77,98,30,20,50,77,22,49,2};
		insertionSort(arr);
		System.out.println(java.util.Arrays.toString(arr));
		
	}
	
	public static void insertionSort(int[] arr) {
		for (int i=1; i<arr.length; i++) {
			int key=arr[i];
			int j=i-1;
			
			while (j>=0 && key<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=key;
			
		}
		
	}
}