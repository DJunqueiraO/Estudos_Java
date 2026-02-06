package exercices.codingbat.array_2;

public class Sum28 {
	public boolean sum28(int[] nums) {
		int sum = 0;
		for(int num : nums) {
			sum += num == 2? 2 : 0;
		}
		return sum == 8;
	}
}
