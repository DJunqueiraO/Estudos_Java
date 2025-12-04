package exercices.codingbat.string_2;

public class StarOut {
    public String starOut(String str) {
        StringBuilder res = new StringBuilder(str);

        for (int i = 0; i < res.length() - 1; i++) {
            final char currentChar = res.charAt(i);
            final char nextChar = res.charAt(i + 1);

            if (currentChar == '*' && nextChar == '*') {
                res.deleteCharAt(i);
                i--;
            }

            final boolean hasNextStar = res.indexOf("*") != -1;

            if (!hasNextStar) {
                break;
            }
        }

        for (int i = 0; i < res.length(); i++) {
            final char currentChar = res.charAt(i);

            if (currentChar != '*') {
                continue;
            }

            if (i == 0) {
                res.delete(i, i + 2);
                continue;
            }

            res.delete(i - 1, i + 2);
            i -= 3;
            final boolean hasNextStar = res.indexOf("*") != -1;

            if (!hasNextStar) {
                break;
            }
        }

        return res.toString();
    }

}
