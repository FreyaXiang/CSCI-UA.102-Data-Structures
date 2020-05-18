public class BinaryZeros {

	public static void main(String[] args) {
		
		System.out.println(countZeros(8));
		System.out.println(countZeros(7));
		System.out.println(countZeros(6));
		

	}

	public static int countZeros(int n) {
		// base case
		if (n == 0) {
			return 0;
		}

		// if n is even
		if (n % 2 == 0) {
			return 1 + countZeros(n / 2);

			// if n is odd
		} else {
			return countZeros(n / 2);
		}
	}
}