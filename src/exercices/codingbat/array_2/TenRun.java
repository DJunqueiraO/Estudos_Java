package exercices.codingbat.array_2;

public class TenRun {
	public int[] tenRun(int[] nums) {
		int ten = -1;
		for(int i = 0; i < nums.length; i++) {
			final int num = nums[i];
			if(num % 10 == 0) {
				ten = num;
			} else if(ten % 10 != 0) {
				ten = num;
			}
			nums[i] = ten;
		}
		return nums;
	}
}
