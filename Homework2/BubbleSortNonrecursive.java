public class BubbleSortNonrecursive {

	public static void main(String[] args) {
		int[] arr1 = { 4, 77, 98, 30, 20, 50, 77, 22, 49, 2 };
		sortNonrecursive1(arr1);
		System.out.println(java.util.Arrays.toString(arr1));
		
		int[] arr2 = { 4, 77, 98, 30, 20, 50, 77, 22, 49, 2 };
		sortNonrecursive1(arr2);
		System.out.println(java.util.Arrays.toString(arr2));

	}

	// best case time complexity: O(n^2)
	public static void sortNonrecursive1(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - (i + 1); j++) {

				// compare
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
	}

	// best case time complexity: O(n)
	public static void sortNonrecursive2(int[] arr) {
		boolean flag = true;

		for (int i = 0; i < arr.length - 1 && flag; i++) {
			flag = false;

			for (int j = 0; j < arr.length - (i + 1); j++) {
				// swap
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;

				// set flag for true
				flag = true;

			}

		}
	}
}