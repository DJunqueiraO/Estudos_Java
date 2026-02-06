package exercices.codingbat.functional_2;

import java.util.List;

public class No9 {
	public List<Integer> no9(List<Integer> nums) {
		nums.removeIf(n -> {
			final String s = String.valueOf(n);
			return s.lastIndexOf('9') == (s.length() - 1);
		});
		return nums;
	}
}
