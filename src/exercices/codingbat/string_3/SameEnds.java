package exercices.codingbat.string_3;

public class SameEnds {
    public String sameEnds(String string) {
        String res = "";
        for (int i = 1; i < ((string.length() / 2) + 1); i++) {
            final StringBuilder start = new StringBuilder(string.substring(0, i));
            final StringBuilder end = new StringBuilder(string.substring(string.length() - i));
            if (start.toString().contentEquals(end)) {
                res = start.toString();
            } else {
                continue;
            }
        }
        return res;
    }

}
