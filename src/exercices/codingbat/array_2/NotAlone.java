package exercices.codingbat.array_2;

public class NotAlone {
	public int[] notAlone(int[] nums, int val) {
		for(int i = 2; i < nums.length; i++) {
			final int a = nums[i];
			final int b = nums[i - 1];
			final int c = nums[i - 2];
			if(
					a != b && b != c
			) {
				nums[i - 1] = Math.max(a, Math.max(b, c));
			}
		}
		return nums;
	}
}
