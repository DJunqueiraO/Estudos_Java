package exercices.codingbat.array_2;

public class More14 {
	public boolean more14(int[] nums) {
		int n1s = 0;
		int n4s = 0;
		for (int num : nums) {
			n1s += num == 1 ? 1 : 0;
			n4s += num == 4 ? 1 : 0;
		}
		return n1s > n4s;
	}
}
