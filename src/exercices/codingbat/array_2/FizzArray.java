package exercices.codingbat.array_2;

public class FizzArray {
	public int[] fizzArray(int n) {
		final int[] a = new int[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		return a;
	}
}
