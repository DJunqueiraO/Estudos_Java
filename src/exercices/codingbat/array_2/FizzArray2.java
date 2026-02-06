package exercices.codingbat.array_2;

public class FizzArray2 {
	public String[] fizzArray2(int n) {
		final String[] a = new String[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = String.valueOf(i);
		}
		return a;
	}
}
