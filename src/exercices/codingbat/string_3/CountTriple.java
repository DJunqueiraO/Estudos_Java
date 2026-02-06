package exercices.codingbat.string_3;

public class CountTriple {
    public int countTriple(String str) {
        int res = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            final char a = str.charAt(i);
            final char b = str.charAt(i + 1);
            final char c = str.charAt(i + 2);
            if (a == b && b == c) {
                res++;
            }
        }
        return res;
    }

}
