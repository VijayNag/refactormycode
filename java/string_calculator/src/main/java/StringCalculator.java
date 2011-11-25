public class StringCalculator {
	private static final String DEFAULT_SEPARATORS = "\n,";

	public int add(String s) {
		if (s.isEmpty())
			return 0;
		return sum(extractNumbers(s));
	}

	private String[] extractNumbers(String s) {
		if (hasCustomSeparator(s))
			return split(removeSeparatorDefinition(s),extractCustomSeparator(s));
		return split(s, DEFAULT_SEPARATORS);
	}

	private String extractCustomSeparator(String s) {
		return Character.toString(s.charAt(2));
	}

	private String removeSeparatorDefinition(String s) {
		return s.substring(4);
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
