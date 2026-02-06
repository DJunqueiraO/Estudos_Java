package exercices.codingbat.array_2;

public class ZeroMax {
	public int[] zeroMax(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			final int a = nums[i];
			if(a == 0) {
				int odd = 0;
				for(int j = i; j < nums.length; j++) {
					final int b = nums[j];
					if(b % 2 != 0 && b > odd) {
						odd = b;
					}
				}
				nums[i] = odd;
			}
		}
		return nums;
	}
}
