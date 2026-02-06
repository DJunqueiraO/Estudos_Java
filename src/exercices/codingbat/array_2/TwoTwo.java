package exercices.codingbat.array_2;

public class TwoTwo {
	public boolean twoTwo(int[] nums) {
		if(
				(nums.length == 1 && nums[0] == 2) ||
						(nums.length == 2 && nums[0] != 2 && nums[1] == 2)
		) {
			return false;
		}
		for(int i = 0; i < nums.length - 2; i++) {
			final int a = nums[i];
			final int b = nums[i + 1];
			final int c = nums[i + 2];
			if(
					((a != 2 && b == 2) && (b == 2 && c != 2)) ||
							((i == nums.length - 3) && (b != 2 && c == 2))
			) {
				return false;
			}
		}
		return true;
	}
}
