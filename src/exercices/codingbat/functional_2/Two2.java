package exercices.codingbat.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
// public List<Integer> two2(List<Integer> nums) {
//   nums = nums.stream().map(num -> num*2).collect(Collectors.toList());
//   nums.removeIf(num -> {
//     final String str = String.valueOf(num);
//     return str.lastIndexOf("2") == str.length() - 1;
//   });
//   return nums;
// }

	public List<Integer> two2(List<Integer> nums) {
		nums = nums.stream().map(num -> num*2).collect(Collectors.toList());
		nums.removeIf(num -> num % 10 == 2);
		return nums;
	}

}
