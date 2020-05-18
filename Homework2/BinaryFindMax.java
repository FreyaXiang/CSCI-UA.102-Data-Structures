public class BinaryFindMax {

	public static void main(String[] args) {

		double[] arr = { 3, 2.4, 6.1, 6.9, 7.44, 1.89, -2.36 };
		System.out.println(findMax(arr, 0, arr.length - 1));

	}

	public static double findMax(double[] arr, int start, int end) { // assuming start=0, end=arr.length-1
		
		// invalid start and end
		if (start > end) {
			return -1;

			// base case
		} else if (start == end) {
			return arr[start];

			// general case
		} else {
			int mid = (start + end) / 2;
			return Math.max(findMax(arr, start, mid), findMax(arr, mid + 1, end));
		}

	}
}