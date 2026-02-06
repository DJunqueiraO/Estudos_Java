package exercices.codingbat.string_3;

public class CountYZ {
    public int countYZ(String str) {
        int res = 0;
        final String[] words = str.split("[^a-zA-z]+");
        for(final String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            final String wordLastChar = String.valueOf(word.charAt(word.length() - 1));
            if (wordLastChar.equalsIgnoreCase("y") || wordLastChar.equalsIgnoreCase("z")) {
                res++;
            }
        }
        return res;
    }

}
