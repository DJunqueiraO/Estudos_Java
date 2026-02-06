package exercices.codingbat.array_2;

public class ZeroFront {
	public int[] zeroFront(int[] nums) {
		final int[] result = new int[nums.length];
		for(int i = nums.length - 1, j = nums.length - 1; i >= 0; i--) {
			final int num = nums[i];
			if(num == 0) {
				continue;
			}
			result[j] = nums[i];
			j--;
		}
		return result;
	}
}
