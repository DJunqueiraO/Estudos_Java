package exercices.codingbat.functional_2;

import java.util.List;

public class NoLong {
	public List<String> noLong(List<String> strings) {
		strings.removeIf(string -> string.length() >= 4);
		return strings;
	}
}
