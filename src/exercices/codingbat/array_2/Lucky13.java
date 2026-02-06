package exercices.codingbat.array_2;

public class Lucky13 {
	public boolean lucky13(int[] nums) {
		for(int num : nums) {
			if(num == 1 || num == 3) {
				return false;
			}
		}
		return true;
	}
}
