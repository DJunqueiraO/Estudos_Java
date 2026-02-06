package exercices.codingbat.array_2;

public class BigDiff {
	public int bigDiff(int[] nums) {
		int min = nums.length > 0? nums[0] : 0;
		int max = 0;
        for (final int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
		return max - min;
	}
}
