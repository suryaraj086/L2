import java.util.TreeMap;

public class TotalCount {

	public static String countValues(String inp) throws Exception {
		nullChecker(inp);
		TreeMap<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < inp.length(); i++) {
			if (map.get(inp.charAt(i)) != null) {
				map.put(inp.charAt(i), map.get(inp.charAt(i)) + 1);
			} else {
				map.put(inp.charAt(i), 1);
			}
		}
		String output = "";
		for (char ch : map.keySet()) {
			output += ch;
			output += map.get(ch);
		}
		return output;
	}

	public static void nullChecker(String inp) throws Exception {
		if (inp == null || inp.isEmpty()) {
			throw new Exception("String is null or empty");

		}
	}

	public static void main(String[] args) {
		try {
			System.out.println(countValues("bbadccdca"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
