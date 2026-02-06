package exercices.codingbat.array_2;

public class SameEnds {
	public boolean sameEnds(int[] nums, int len) {

		for(int i = 0; i < len && len < nums.length; i++) {

			final int a = nums[i];
			final int b = nums[nums.length - len + i];
			if(a != b) {
				return false;
			}
		}
		return true;
	}
}
