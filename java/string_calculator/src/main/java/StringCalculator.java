public class StringCalculator {
	public int add(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		if (s.startsWith("//")) {
			int result = 0;
			String[] numbers = s.substring(4).split("[\n" + s.charAt(2) + "]");
			for (String n : numbers) {
				result += Integer.parseInt(n);
			}
			return result;
		} else {
			int result = 0;
			String[] numbers = s.split("[\n,]");
			for (String n : numbers) {
				result += Integer.parseInt(n);
			}
			return result;
		}
	}
}
