package exercices.codingbat.string_3;

public class EqualIsNot {
    public boolean equalIsNot(String str) {
        final StringBuilder builder = new StringBuilder(str);
        boolean res = false;
        while (true) {
            final int currentIs = builder.toString().indexOf("is");
            final int currentNot = builder.toString().indexOf("not");
            if (currentIs == -1 && currentNot == -1) {
                res = true;
                break;
            } else if (currentIs == -1 || currentNot == -1) {
                break;
            }
            builder.delete(currentIs, currentIs + 1);
            builder.delete(currentNot, currentNot + 2);
        }
        return res;
    }

// public boolean equalIsNot(String str) {
//     int countIs = 0;
//     int countNot = 0;
//     int n = str.length();

//     for (int i = 0; i < n; i++) {
//         if (i <= n - 2 && str.regionMatches(false, i, "is", 0, 2)) {
//             countIs++;
//         }
//         if (i <= n - 3 && str.regionMatches(false, i, "not", 0, 3)) {
//             countNot++;
//         }
//     }
//     return countIs == countNot;
// }
}
