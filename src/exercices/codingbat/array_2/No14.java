package exercices.codingbat.array_2;

public class No14 {
	public boolean no14(int[] nums) {
		if(nums.length == 0 || nums.length == 1) {
			return true;
		}
		boolean has1 = false;
		boolean has4 = false;
		for(int num : nums) {
			has1 = has1? has1 : num == 1;
			has4 = has4? has4 : num == 4;
		}
		return has1 ^ has4;
	}
}
