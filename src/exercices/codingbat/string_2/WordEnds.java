package exercices.codingbat.string_2;

public class WordEnds {
    public String wordEnds(String str, String word) {
        final StringBuilder res = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            final int nextIndex = str.substring(i).indexOf(word) + i;
            if(i == nextIndex) {
                if(i != 0) {
                    res.append(str.charAt(i - 1));
                }
                if(nextIndex + word.length() < str.length()) {
                    res.append(str.charAt(nextIndex + word.length()));
                }
            }
        }

        return res.toString();
    }

}
