package exercices.codingbat.string_3;

public class MirrorEnds {
	public String mirrorEnds(String string) {
		String res = "";
		for (int i = 1; i <= string.length(); i++) {
			final StringBuilder start = new StringBuilder(string.substring(0, i));
			final StringBuilder end = new StringBuilder(string.substring(string.length() - i));
			if (start.toString().contentEquals(end.reverse())) {
				res = start.toString();
			} else {
				continue;
			}
		}
		return res;
	}
}
