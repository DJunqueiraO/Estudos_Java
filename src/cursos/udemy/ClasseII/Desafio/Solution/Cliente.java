package curso.ClasseII.Desafio.Solution;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final List<Compra> compras = new ArrayList<Compra>();
	final String nome;
	public Cliente(String nome) {
		this.nome = nome;
	}
	void adicionarCompra(Compra compra) {
		compras.add(compra);
	}
	double obterValorTotal() {
		double total = 0;
		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}
