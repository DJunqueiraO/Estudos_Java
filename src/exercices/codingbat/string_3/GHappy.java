package exercices.codingbat.string_3;

public class GHappy {
    public boolean gHappy(String str) {

        if (str.isEmpty()) {
            return true;
        }

        final StringBuilder builder = new StringBuilder(str);
        boolean res = false;

        for (int i = 1; i < builder.length(); i++) {
            final char prev = builder.charAt(i - 1);
            final char current = builder.charAt(i);

            if (prev == 'g' && current == 'g') {
                res = true;
            } else if (prev != 'g' && current == 'g') {
                res = false;
            }
        }

        return res;
    }

}
