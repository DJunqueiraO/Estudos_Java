package exercices.codingbat.array_2;

public class Has22 {
	// public boolean has22(int[] nums) {
	//   int result = 0;
	//   for(int num : nums) {
	//     if(result == 2) {
	//       break;
	//     }
	//     if(num == 2) {
	//       result += 1;
	//     } else {
	//       result = 0;
	//     }
	//   }
	//   return result == 2;
	// }

	public boolean has22(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				return true;
			}
		}
		return false;
	}
}
