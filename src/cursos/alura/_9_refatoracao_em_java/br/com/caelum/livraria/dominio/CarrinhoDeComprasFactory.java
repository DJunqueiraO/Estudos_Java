package cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio;

//import java.util.HashSet;
//import java.util.Set;
//
//import org.javamoney.moneta.Money;
//
//public class CarrinhoDeComprasFactory {
//	
//	private final Set<CarrinhoDeCompras> carrinhos;
//	
//	public CarrinhoDeComprasFactory() {
//		this.carrinhos = new HashSet<CarrinhoDeCompras>();
//	}
//
//	public CarrinhoDeCompras obterCarrinho(
//			Cliente cliente, 
//			Livro livro,
//			Money valorFrete
//	) {
//		CarrinhoDeCompras carrinho = new CarrinhoDeCompras(cliente, livro, valorFrete, now());
//		if(carrinhos.contains(carrinho)) {
//			carrinho = carrinhos.stream()
//					.filter(umCarrinho -> umCarrinho.doCliente(cliente))
//					.findFirst().orElse(null);
//			if(carrinho != null) carrinho.adicionar(livro);
//		}
//		else carrinhos.add(carrinho);
//		return carrinho;
//	}
//	
//}
