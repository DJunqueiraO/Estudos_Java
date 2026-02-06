package exercices.codingbat.array_2;

public class IsEverywhere {
	// 	public boolean isEverywhere(int[] nums, int val) {
	// 	  if(nums.length <= 1) {
	// 	    return true;
	// 	  }
	// 		final int[] a = new int[((int) (nums.length / 2)) + (nums.length % 2 == 0 ? 0 : 1)];
	// 		final int[] b = new int[((int) (nums.length / 2))];
	// 		for (int i = 0; i < nums.length; i++) {
	// 			final int num = nums[i];
	// 			if (i % 2 == 0) {
	// 				a[i / 2] = num;
	// 			} else {
	// 				b[(int) (i / 2)] = num;
	// 			}
	// 		}
	// 		boolean aEverywhere = true;
	// 		for(int num : a) {
	// 			if(num != a[0]) {
	// 				aEverywhere = false;
	// 				break;
	// 			}
	// 		}
	// 		boolean bEverywhere = true;
	// 		for(int num : b) {
	// 			if(num != b[0]) {
	// 				bEverywhere = false;
	// 				break;
	// 			}
	// 		}
	// 		if(aEverywhere || bEverywhere) {
	// 			return (aEverywhere && a[0] == val) || (bEverywhere && b[0] == val);
	// 		}
	// 		return false;
	// 	}

	public boolean isEverywhere(int[] nums, int val) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != val && nums[i + 1] != val) {
				return false;
			}
		}
		return true;
	}
}
