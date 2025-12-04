package exercices.codingbat.string_2;

public class XyzMiddle {
    public boolean xyzMiddle(String str) {

        final int maxLength = str.length();
        final boolean hasXyz = str.contains("xyz");

        if(!hasXyz) {
            return false;
        }

        final int xyzLength = Math.abs((str.replace("xyz", "").length() - maxLength));
        final boolean hasOnlyOneXyz = xyzLength == 3;

        if(!hasOnlyOneXyz) {
            final int numberOfXyz = xyzLength/3;
            for(int i = 0;i < numberOfXyz; i++) {
                if(verifyFirstXyzIndex(str)) {
                    return true;
                }
                str = str.replaceFirst("xyz", "___");
            }
        }

        return verifyFirstXyzIndex(str);
    }

    public boolean verifyFirstXyzIndex(String str) {

        int xyzPosition = str.indexOf("xyz");

        if(xyzPosition == -1) {
            return false;
        }

        final int leftSize = str.substring(0, xyzPosition).length();
        final int rightSize = str.substring(xyzPosition + 3).length();

        return Math.abs(leftSize - rightSize) <= 1;
    }


}
