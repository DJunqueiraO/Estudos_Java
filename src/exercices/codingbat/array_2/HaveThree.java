package exercices.codingbat.array_2;

public class HaveThree {
	public boolean haveThree(int[] nums) {
		int three = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			final int num = nums[i];
			final int next = nums[i + 1];
			if(
					(next == 3 && num != 3) ||
							(i == 0 && num == 3 && next != 3)
			) {
				three++;
			}
		}
		return three == 3;
	}
}
