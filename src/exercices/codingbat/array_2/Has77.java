package exercices.codingbat.array_2;

public class Has77 {
	public boolean has77(int[] nums) {
		boolean hasSevenSevenOrSevenThingSeven = false;
		for(int i = 0; i < nums.length - 1; i++) {
			final int a = nums[i];
			final int b = nums[i + 1];
			if(a == 7 && a == b) {
				return true;
			}
			if(i + 2 >= nums.length) {
				break;
			}
			final int c = nums[i + 2];
			if(a == 7 && a == c) {
				return true;
			}
		}
		return false;
	}
}
