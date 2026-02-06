package exercices.codingbat.functional_2;

import java.util.List;

public class No34 {
	public List<String> no34(List<String> strings) {
		strings.removeIf(string -> string.length() == 4 || string.length() == 3);
		return strings;
	}
}
