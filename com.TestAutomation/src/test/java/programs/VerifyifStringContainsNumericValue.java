package programs;

public class VerifyifStringContainsNumericValue {

	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	public static boolean isNumeric(CharSequence cs) {
		if (isEmpty(cs)) {
			return false;
		}
		for (int i = 0; i < cs.length(); i++) {
			if (!Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(isNumeric(null));
		System.out.println(isNumeric("0"));
		System.out.println(isNumeric("ABC123"));
		System.out.println(isNumeric("123"));
	}
}
