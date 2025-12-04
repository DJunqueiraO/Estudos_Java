package exercices.codingbat.string_2;

public class ZipZap {
    public String zipZap(String str) {
        final StringBuilder res = new StringBuilder(str);
        for(int i = 0; i < str.length() && i + 2 < str.length(); i++) {
            final char start = str.charAt(i);
            final char end = str.charAt(i + 2);
            if(start == 'z' && end == 'p') {
                res.deleteCharAt(i + 1);
            }
        }
        if(res.length() > 2) {
            res.replace(res.length() - 1, res.length(), "p");
        }
        return res.toString();
    }

}
