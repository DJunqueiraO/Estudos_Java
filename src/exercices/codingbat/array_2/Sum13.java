package exercices.codingbat.array_2;

public class Sum13 {
	public int sum13(int[] nums) {
		if(nums.length == 0) {
			return 0;
		}
		int a = 0;
		for(int i = 0; i < nums.length; i++) {
			final int num = nums[i];
			if(num == 13) {
				i++;
				continue;
			}
			a += num;
		}
		return a;
	}
}
