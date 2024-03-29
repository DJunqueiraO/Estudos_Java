package curso.ClasseII.Compra;

import java.util.ArrayList;

public class Compra {
	String nomeDoCliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	void adicionarItem(String nome, int quantidade, double preco) {
		adicionarItem(new Item(nome, quantidade, preco));
	}
	double pegarValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
}
