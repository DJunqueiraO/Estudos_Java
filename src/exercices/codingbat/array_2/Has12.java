package exercices.codingbat.array_2;

public class Has12 {
	public boolean has12(int[] nums) {
		boolean isAOne = false;
		boolean isATwo = false;
		for(int num : nums) {
			if(!isAOne && num == 1) {
				isAOne = true;
			}
			if(isAOne && !isATwo && num == 2) {
				isATwo = true;
				break;
			}
		}
		return isAOne && isATwo;
	}
}
