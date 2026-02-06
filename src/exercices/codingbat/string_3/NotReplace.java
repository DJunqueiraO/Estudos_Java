package exercices.codingbat.string_3;

public class NotReplace {
    public String notReplace(String str) {
        return str.replaceAll("(?<![A-Za-z])is(?![A-Za-z])", "is not");
    }
}
