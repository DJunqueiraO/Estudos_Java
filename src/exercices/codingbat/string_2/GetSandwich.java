package exercices.codingbat.string_2;

public class GetSandwich {
    public String getSandwich(String str) {
        final String bread = "bread";

        if(str.indexOf(bread) == -1) {
            return "";
        }

        final StringBuilder res = new StringBuilder(str);

        for(int i = 0; i < res.length(); i++) {
            final int nextIndex = res.substring(i).indexOf(bread);
            if(nextIndex == -1) {
                res.delete(i - 1, res.length());
            } else if(i == 0) {
                res.delete(0, nextIndex + bread.length());
            }
        }

        return res.toString();
    }
}
