package exercices.codingbat.array_2;

public class EvenOdd {
	public int[] evenOdd(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			final int a = nums[i];
			if(a % 2 == 0) {
				continue;
			}
			for(int j = i + 1; j < nums.length; j++) {
				final int b = nums[j];
				if(b % 2 == 0) {
					nums[i] = b;
					nums[j] = a;
					break;
				}
			}
		}
		return nums;
	}
}
