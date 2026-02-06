package exercices.codingbat.functional_2;

import java.util.List;

public class NoTeen {
	public List<Integer> noTeen(List<Integer> nums) {
		nums.removeIf(num -> num >= 13 && num <= 19);
		return nums;
	}
}
