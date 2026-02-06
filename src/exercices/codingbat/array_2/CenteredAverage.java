package exercices.codingbat.array_2;

public class CenteredAverage {
	public int centeredAverage(int[] nums) {
		int sum = 0;
		int min = nums[0];
		int max = nums[0];

		for (int n : nums) {
			sum += n;
			if (n < min) min = n;
			if (n > max) max = n;
		}

		// remove um min e um max
		sum = sum - min - max;

		return sum / (nums.length - 2);
	}
}
