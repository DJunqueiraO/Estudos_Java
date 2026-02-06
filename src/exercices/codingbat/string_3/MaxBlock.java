package exercices.codingbat.string_3;

public class MaxBlock {
    public int maxBlock(String str) {
        final int length = str.length();
        int res = 0;
        int acc = 1;
        for (int i = 1; i < length; i++) {
            final char previous = str.charAt(i - 1);
            final char current = str.charAt(i);
            if (previous == current) {
                acc++;
            } else {
                acc = 1;
            }
            if (acc > res) {
                res = acc;
            }
        }
        return res;
    }

}
