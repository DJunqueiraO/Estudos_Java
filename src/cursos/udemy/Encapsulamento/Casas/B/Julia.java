package curso.Encapsulamento.Casas.B;

import curso.Encapsulamento.Casas.A.Ana;

public class Julia {
	Ana sogra = new Ana();
	void testeAcessos() {
		System.out.println(sogra.todosSabem);
	}
}
