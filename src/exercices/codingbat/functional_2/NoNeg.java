package exercices.codingbat.functional_2;

import java.util.List;

public class NoNeg {
// public List<Integer> noNeg(List<Integer> nums) {
//   for(int i = 0; i < nums.size(); i++) {
//     final int num = nums.get(i);
//     if(num < 0) {
//       nums.remove(i);
//       i--;
//     }
//   }
//   return nums;
// }

// public List<Integer> noNeg(List<Integer> nums) {
//   return nums.stream()
//     .filter(n -> n >= 0)
//     .collect(Collectors.toList());
// }

    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }
}
