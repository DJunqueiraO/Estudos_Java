package exercices.codingbat.array_2;

public class Post4 {
	public int[] post4(int[] nums) {
		int i = nums.length - 1;
		for(; i >= 0; i--) {
			final int num = nums[i];
			if(num == 4) {
				break;
			}
		}
		final int[] result = new int[nums.length - i - 1];
		for(int j = 0; j < result.length; j++) {
			result[j] = nums[i + j + 1];
		}
		return result;
	}
}
