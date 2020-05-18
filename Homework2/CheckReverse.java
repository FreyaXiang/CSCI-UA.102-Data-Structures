public class CheckReverse {

	public static void main(String[] args) {

		System.out.println(isReverse(" g oo gle", "ELGOOG"));
		System.out.println(isReverse("data", "ata"));

	}

	public static int isReverse(String s1, String s2) {

		int i = 0, j = s2.length() - 1;

		while (i < s1.length() && j >= 0) {

			char charInS1 = Character.toLowerCase(s1.charAt(i));
			char charInS2 = Character.toLowerCase(s2.charAt(j));

			// ignore white spaces
			if (charInS1 == ' ') {
				i++;
				continue;
			}

			if (charInS2 == ' ') {
				j--;
				continue;
			}

			// check if the characters are the same
			if (!(charInS1 == charInS2)) {
				return 0;
			} else {
				i++;
				j--;
			}
		}

		// consider the rest of the longer string
		while (i < s1.length()) {
			if (!(s1.charAt(i++) == ' ')) {
				return 0;
			}
		}

		while (j >= 0) {
			if (!(s2.charAt(j--) == ' ')) {
				return 0;
			}
		}

		return 1;
	}
}