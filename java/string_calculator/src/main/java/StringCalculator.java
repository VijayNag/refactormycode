public class StringCalculator {
	public int add(String s) {
		if (s.isEmpty())
			return 0;
		return sum(extractNumbers(s));
	}

	private String[] extractNumbers(String s) {
		if (hasCustomSeparator(s))
			return s.substring(4).split("[\n" + s.charAt(2) + "]");
		return s.split("["+"\n,"+"]");
	}

	private boolean hasCustomSeparator(String s) {
		return s.startsWith("//");
	}

	private int sum(String[] numbers) {
		int result = 0;
		for (String n : numbers)
			result += Integer.parseInt(n);
		return result;
	}
}
