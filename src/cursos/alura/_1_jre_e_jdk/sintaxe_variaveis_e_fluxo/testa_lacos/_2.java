package cursos.alura._1_jre_e_jdk.sintaxe_variaveis_e_fluxo.testa_lacos;

public class _2 {
	public static void main(String[] args) {
		for(int linha = 1; linha <= 10; linha++) {
			for(int coluna = 1; coluna <= 10; coluna++) {
				if(coluna > linha) break;
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
