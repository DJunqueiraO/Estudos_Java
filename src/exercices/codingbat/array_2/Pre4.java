package exercices.codingbat.array_2;

public class Pre4 {
	public int[] pre4(int[] nums) {
		int i = 0;
		for(; i < nums.length; i++) {
			final int num = nums[i];
			if(num == 4) {
				break;
			}
		}
		final int[] result = new int[i];
		for(int j = 0; j < result.length; j++) {
			result[j] = nums[j];
		}
		return result;
	}
}
