package exercices.codingbat.string_3;

public class WithoutString {
    public String withoutString(String base, String remove) {
        if (remove.isEmpty()) return base;
        StringBuilder result = new StringBuilder();
        int counter = 0;
        int baseLength = base.length();
        int removeLength = remove.length();

        while (counter < baseLength) {
            if (counter <= baseLength - removeLength && base.regionMatches(true, counter, remove, 0, removeLength)) {
                counter += removeLength;
            } else {
                result.append(base.charAt(counter));
                counter++;
            }
        }
        return result.toString();
    }

}
