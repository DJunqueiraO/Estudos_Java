package exercices.codingbat.array_2;

public class TripleUp {
	public boolean tripleUp(int[] nums) {
		for(int i = 2; i < nums.length; i++) {
			final int a = nums[i];
			final int b = nums[i - 1];
			final int c = nums[i - 2];
			if(a == b + 1 && b == c + 1) {
				return true;
			}
		}
		return false;
	}
}
