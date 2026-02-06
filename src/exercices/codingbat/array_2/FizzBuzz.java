package exercices.codingbat.array_2;

public class FizzBuzz {
	// public String[] fizzBuzz(int start, int end) {
	//   final String[] nums = new String[end - start];
	//   for(int i = 0; i < nums.length; i++) {
	//     final int num = i + start;
	//     if(num % 3 == 0 && num % 5 == 0) {
	//       nums[i] = "FizzBuzz";
	//       continue;
	//     }
	//     if(num % 3 == 0) {
	//       nums[i] = "Fizz";
	//       continue;
	//     }
	//     if(num % 5 == 0) {
	//       nums[i] = "Buzz";
	//       continue;
	//     }
	//     nums[i] = String.valueOf(num);
	//   }
	//   return nums;
	// }

	public String[] fizzBuzz(int start, int end) {
		final String[] nums = new String[end - start];
		for(int i = 0; i < nums.length; i++) {
			final int num = i + start;
			nums[i] = "";
			if(num % 3 == 0) {
				nums[i] += "Fizz";
			}
			if(num % 5 == 0) {
				nums[i] += "Buzz";
			}
			if(nums[i].length() == 0) {
				nums[i] = String.valueOf(num);
			}

		}
		return nums;
	}
}