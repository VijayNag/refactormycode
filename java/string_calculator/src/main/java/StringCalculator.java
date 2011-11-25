public class StringCalculator {
	public int add(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		if (s.startsWith("//")) {
			String[] numbers = s.substring(4).split("[\n" + s.charAt(2) + "]");
			return sum(numbers);
		} else {
			String[] numbers = s.split("[\n,]");
			return sum(numbers);
		}
	}

	private int sum(String[] numbers) {
		int result = 0;
		for (String n : numbers) {
			result += Integer.parseInt(n);
		}
		return result;
	}
}
