package cursos.alura._1_2_design_patterns._1.imposto;

import cursos.alura._1_2_design_patterns._1.Orcamento;

public class ICCC extends Imposto {

	public ICCC() {
		super(null);
	}

	public ICCC(Imposto next) {
		super(next);
	}

	@Override
	public double calcular(Orcamento orcamento) {
		final double valorOrcamento = orcamento.getValor();
		if(valorOrcamento < 1000) return valorOrcamento*0.05;
		if(valorOrcamento < 3000) return valorOrcamento*0.07;
		return valorOrcamento*0.08 + 30;
	}
}
