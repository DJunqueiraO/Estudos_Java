 package experiences.calculadora.baskara;

import javax.swing.SwingUtilities;

public class Application {
	public static void  main(String[] args) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					new Calculadora();
				}
			}
		);
	}
}
