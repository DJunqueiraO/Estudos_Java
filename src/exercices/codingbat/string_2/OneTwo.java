package exercices.codingbat.string_2;

public class OneTwo {
    public String oneTwo(String str) {
        final StringBuilder res = new StringBuilder(str);
        for(int i = 0; i < str.length(); i += 3) {
            final char firstChar = res.toString().charAt(i);
            final int limit = i + 3;
            if(limit > res.toString().length()) {
                res.delete(i, res.toString().length());
                break;
            }
            final String remainSubstring = res.toString().substring(i + 1, limit);
            res.replace(i, i + 3, remainSubstring + firstChar);

        }
        return res.toString();
    }

}
