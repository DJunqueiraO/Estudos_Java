package exercices.codingbat.string_2;

public class SameStarChar {
    public boolean sameStarChar(String str) {
        boolean result = false;

        if(str.equals("") || !str.contains("*") || str.replace("*", "").length() == 0) {
            return true;
        }

        for(int i = 0; i < str.length(); i++) {

            final boolean isFirstIndex = i == 0;
            final boolean isLastIndex = i == str.length() - 1;

            final Character prestar = isFirstIndex? null : str.charAt(i - 1);
            final char star = str.charAt(i);
            final Character posstar = isLastIndex? null : str.charAt(i + 1);

            if(prestar == null || posstar == null) {
                continue;
            }
            if(star == '*' && prestar == posstar) {
                result = true;
            }
            if(star == '*' && prestar != posstar) {
                result = false;
            }
        }

        return result;
    }

}
