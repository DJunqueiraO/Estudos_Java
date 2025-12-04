package exercices.codingbat.string_2;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        final int totalLength = str.length();
        final int finalLength = str.replaceAll("" + str.charAt(n - 1), "").length();
        final int diff = totalLength - finalLength;

        return diff != 1;
    }

}
