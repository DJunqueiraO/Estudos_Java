package exercices.codingbat.string_3;

public class SumDigits {
    public int sumDigits(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            final String current = String.valueOf(str.charAt(i));
            if (Character.isDigit(current.charAt(0))) {
                final int number = Integer.parseInt(current);
                result += number;
            } else {
                continue;
            }
        }
        return result;
    }

}
