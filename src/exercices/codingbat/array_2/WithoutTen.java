package exercices.codingbat.array_2;

public class WithoutTen {
	public int[] withoutTen(int[] nums) {
		final int[] result = new int[nums.length];
		for(int i = 0, j = 0; i < nums.length; i++) {
			int num = nums[i];
			if(num == 10) {
				continue;
			}
			result[j] = nums[i];
			j++;

		}
		return result;
	}
}
