package cursos.alura._1_jre_e_jdk.sintaxe_variaveis_e_fluxo;

public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		System.out.println(segundo);
	}
}
