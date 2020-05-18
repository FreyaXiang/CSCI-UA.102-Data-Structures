public class BubbleSortRecursive {
	
	public static void main(String[] args) {
		int[] arr1= {4,77,98,30,20,50,77,22,49,2};
		sortRecursive1(arr1, arr1.length);
		System.out.println(java.util.Arrays.toString(arr1));
		
		int[] arr2= {4,77,98,30,20,50,77,22,49,2};
		sortRecursive2(arr2, arr2.length, true);
		System.out.println(java.util.Arrays.toString(arr2));
		
	}
	
	// best case time complexity: O(n^2)
	public static void sortRecursive1(int[] arr, int size) {  
	//assume start=0, size=arr.length
		
		if (size>1) {
			//general case
			for (int j=0; j<size-1; j++) {
				if (arr[j]>arr[j+1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}	
			}
			
			sortRecursive1(arr, size-1);
		}
		
	}
	
	// best case time complexity: O(n)
	public static void sortRecursive2(int[] arr, int size, boolean flag) {
	// assume start=0, size=arr.length, initial flag=true
		
		if (flag==false) {
			return;
		}
		
		flag=false;
		
		if (size>1) {
			//general case
			for (int j=0; j<size-1; j++) {
				if (arr[j]>arr[j+1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}	
			}
			
			sortRecursive2(arr, size-1, flag);
		}
		
		
		
	}
}