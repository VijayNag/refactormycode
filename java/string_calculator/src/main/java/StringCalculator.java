public class StringCalculator {
	public int add(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		if (s.startsWith("//")) {
			int result = 0;
			for (String n : s.substring(4).split("[\n" + s.charAt(2) + "]")) {
				result += Integer.parseInt(n);
			}
			return result;
		} else {
			int result = 0;
			for (String n : s.split("[\n,]")) {
				result += Integer.parseInt(n);
			}
			return result;
		}
	}
}
