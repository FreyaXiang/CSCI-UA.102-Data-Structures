public class Palindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome("r,adar", 0, "r,adar".length() - 1));
		System.out.println(isPalindrome("data", 0, "data".length() - 1));

	}

	public static boolean isPalindrome(String word, int start, int end) { // assuming start=0, end=word.length()-1

		// base case
		if (start >= end) {
			return true;

			// general case
		} else {

			// ignore punctuation
			if (Character.toUpperCase(word.charAt(start)) < 65 || Character.toUpperCase(word.charAt(start)) > 90) {
				start++;
			}

			if (Character.toUpperCase(word.charAt(end)) < 65 || Character.toUpperCase(word.charAt(end)) > 90) {
				end--;
			}

			if (word.charAt(start) == word.charAt(end)) {
				return isPalindrome(word, start + 1, end - 1);
			} else {
				return false;
			}

		}
	}
}