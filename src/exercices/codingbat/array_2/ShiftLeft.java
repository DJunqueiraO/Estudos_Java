package exercices.codingbat.array_2;

public class ShiftLeft {
	public int[] shiftLeft(int[] nums) {
		if(nums.length == 0 || nums.length == 1) {
			return nums;
		}
		if(nums.length == 2) {
			final int a = nums[0];
			final int b = nums[1];
			nums[0] = b;
			nums[1] = a;
			return nums;
		}
		final int a = nums[0];
		for(int i = 2; i < nums.length; i++) {
			final int b = nums[i];
			final int c = nums[i - 1];
			nums[i - 1] = b;
			nums[i - 2] = c;
		}
		nums[nums.length - 1] = a;
		return nums;
	}
}
