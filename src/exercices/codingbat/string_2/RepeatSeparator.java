package exercices.codingbat.string_2;

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        final StringBuilder result = new StringBuilder();
        if(count > 0) {
            result.append(word);
            for(;count > 1; count--) {
                result.append(sep);
                result.append(word);
            }
        }
        return result.toString();
    }

}
