package exercices.codingbat.array_2;

public class Either24 {
	public boolean either24(int[] nums) {
		boolean hasTwoTwo = false;
		boolean hasFourFour = false;
		for(int i = 0; i < nums.length - 1; i++) {
			final int current = nums[i];
			final int next = nums[i + 1];

			if(!hasTwoTwo && current == 2 && current == next) {
				hasTwoTwo = true;
			}

			if(!hasFourFour && current == 4 && current == next) {
				hasFourFour = true;
			}
		}
		return hasFourFour ^ hasTwoTwo;
	}
}
