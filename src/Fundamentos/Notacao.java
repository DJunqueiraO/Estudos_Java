package Fundamentos;

public class Notacao {
	public static void main(String[] args) {
		double a = 2.3;
//		String s = "Bom dia Josicleison";
		var frase = "Bom dia x";
		frase = frase.toUpperCase();
		frase = frase.replace("X", "Josicleison");
		frase = frase.concat("!!!");
		System.out.print(frase);
		System.out.print("\nJOSICLEISON".toLowerCase());
		String phrase = "\n\nMeuzovo"
				.replace("z", "s ")
				.toUpperCase()
				.concat("s");
		System.out.print(phrase);
	}
}
