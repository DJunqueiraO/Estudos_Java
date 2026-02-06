package exercices.codingbat.string_3;

public class SumNumbers {
    public int sumNumbers(String str) {
        int res = 0;
        final StringBuilder acc = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            final char current = str.charAt(i);
            final boolean isNumber = Character.isDigit(current);
            if (isNumber) {
                acc.append(String.valueOf(current));
            }
            if (i == str.length() - 1 || !isNumber) {
                res += Integer.parseInt(acc.toString().isEmpty() ? "0" : acc.toString());
                acc.delete(0, acc.length());
            }
        }
        return res;
    }

}
