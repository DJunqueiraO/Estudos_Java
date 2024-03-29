package curso.ClasseII.Carro;

public class Carro {
	final Motor motor;
	public Carro() { 
		motor = new Motor(this);
	}
	void acelerar() {
		if (motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	void ligar() {
		motor.ligado = true;
	}
	void desligar() {
		motor.ligado = false;
	}
	boolean isLigado() {
		return motor.ligado;
	}
}
