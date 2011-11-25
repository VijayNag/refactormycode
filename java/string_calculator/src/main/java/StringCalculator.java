public class StringCalculator {
	public int add(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		String[] numbers;
		if (s.startsWith("//")) {
			numbers = s.substring(4).split("[\n" + s.charAt(2) + "]");
			return sum(numbers);
		} else {
			numbers = s.split("[\n,]");
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
