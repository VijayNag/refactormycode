public class StringCalculator {
	private static final String DEFAULT_SEPARATORS = "\n,";

	public int add(String s) {
		if (s.isEmpty())
			return 0;
		return sum(extractNumbers(s));
	}

	private String[] extractNumbers(String s) {
		if (hasCustomSeparator(s))
			return s.substring(4).split("[\n" + s.charAt(2) + "]");
		return split(s, DEFAULT_SEPARATORS);
	}
	
	private String[] split(String textToSplit, String separators){
		return textToSplit.split("["+separators+"]");
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
