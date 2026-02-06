package exercices.codingbat.array_2;

public class MatchUp {
	public int matchUp(int[] nums1, int[] nums2) {
		int r = 0;
		for(int i = 0; i < nums1.length; i++) {
			final int num1 = nums1[i];
			final int num2 = nums2[i];
			int diff = Math.abs(num1 - num2);
			if(diff > 0 && diff <= 2) {
				r++;
			}
		}
		return r;
	}
}
