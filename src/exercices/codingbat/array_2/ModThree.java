package exercices.codingbat.array_2;

public class ModThree {
	public boolean modThree(int[] nums) {
		int even = 0;
		int odd = 0;
        for (final int num : nums) {
            if (even == 3 || odd > 3) {
                break;
            }
            if (num % 2 == 0) {
                even++;
                if (odd > 0) {
                    odd--;
                }
            } else {
                odd++;
                if (even > 0) {
                    even--;
                }
            }
        }
		final boolean triEven = even >= 3;
		final boolean triOdd = odd >= 3;
		return triEven || triOdd;
	}
}
