package exercices.codingbat.array_2;

public class Sum67 {
	// public int sum67(int[] nums) {
	//   if(nums.length == 0) {
	//     return 0;
	//   }
	//   int result = 0;
	//   boolean ignore = false;
	//   int i = 0;
	//   for(; i < nums.length; i++) {
	//     final int num = nums[i];
	//     if(num == 6) {
	//       ignore = true;
	//     }
	//     if(num == 7) {
	//       if(ignore) {
	//         ignore = false;
	//         continue;
	//       }
	//     }
	//     if(ignore) {
	//       continue;
	//     }
	//     result += num;
	//   }
	//   return result;
	// }

	public int sum67(int[] nums) {
		int result = 0;
		boolean ignore = false;
		for (int num : nums) {
			if (num == 6) {
				ignore = true;
				continue;
			}
			if (ignore) {
				if (num == 7) {
					ignore = false;
				}
				continue;
			}
			result += num;
		}
		return result;
	}
}
