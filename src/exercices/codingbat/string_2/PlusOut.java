package exercices.codingbat.string_2;

public class PlusOut {
    public String plusOut(String str, String word) {
        final StringBuilder res = new StringBuilder(str);
        for(int i = 0; i < str.length(); i++) {
            final int index = res.substring(i).indexOf(word) + i;
            if(i == index) {
                i += word.length() - 1;
                continue;
            }
            res.replace(i, i + 1, "+");
        }
        return res.toString();
    }

}
