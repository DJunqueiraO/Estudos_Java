package exercices.codingbat.array_2;

public class CountEvens {
	public int countEvens(int[] nums) {
		int numberOfEvenInts = 0;
		for(int i = 0; i < nums.length; i++) {
			final int num = nums[i];
			if(num % 2 == 0) {
				numberOfEvenInts++;
			}
		}
		return numberOfEvenInts;
	}
}
