package exercices.codingbat.array_2;

public class FizzArray3 {
	public int[] fizzArray3(int start, int end) {
		final int[] nums = new int[end - start];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = start + i;
		}
		return nums;
	}
}
