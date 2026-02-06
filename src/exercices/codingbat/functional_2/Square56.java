package exercices.codingbat.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
// public List<Integer> square56(List<Integer> nums) {
//   nums = nums.stream().map(num -> (num*num) + 10).collect(Collectors.toList());
//   nums.removeIf(num -> {
//     final String str = String.valueOf(num);
//     return (
//       str.lastIndexOf('5') == str.length() - 1 ||
//       str.lastIndexOf('6') == str.length() - 1
//     );
//   });
//   return nums;
// }

    public List<Integer> square56(List<Integer> nums) {
        nums = nums.stream().map(num -> (num * num) + 10).collect(Collectors.toList());
        nums.removeIf(num -> num % 10 == 5 || num % 10 == 6);
        return nums;
    }

}
