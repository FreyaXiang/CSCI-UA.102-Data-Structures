public class LeaveShortest {

	public static void main(String[] args) {
		System.out.println(shortestThree(
				"Other entries include a historic district in Charlottesville Virginia cut-flower greenhouse complex"));

	}

	public static String shortestThree(String s) {

		String[] arr = s.split(" ");
		String result = "";

		for (int i = 0; i < arr.length; i += 3) {
			int len1 = arr[i].length();
			int len2 = arr[i + 1].length();
			int len3 = arr[i + 2].length();

			int shortestLen = Math.min(Math.min(len1, len2), len3);

			if (shortestLen == len1) {
				result += arr[i] + " ";
			} else if (shortestLen == len2) {
				result += arr[i + 1] + " ";
			} else {
				result += arr[i + 2] + " ";
			}

		}

		return result;
	}
}