package curso.Heranca.Teste;

import curso.Heranca.Jogo.Direcao;
import curso.Heranca.Jogo.Heroi;
import curso.Heranca.Jogo.Monstro;

class Jogo {
	public static void main(String[] args) {
		var monster = new Monstro();
		monster.x = 10;
		monster.y = 10;
		var hero = new Heroi();
		hero.x = 10;
		hero.y = 11;
		
		System.out.println(monster.status());
		System.out.println(hero.status());
		
		monster.atacar(hero);
		hero.atacar(monster);
		monster.atacar(hero);
		hero.atacar(monster);
		monster.atacar(hero);
		hero.atacar(monster);
		monster.atacar(hero);
		monster.andar(Direcao.NORTE);
		hero.atacar(monster);
  
		System.out.println(monster.status());
		System.out.println(hero.status());
		
//		jogador_1.andar(Direcao.NORTE);
//		jogador_1.andar(Direcao.LESTE);
//		jogador_1.andar(Direcao.NORTE);
//		jogador_1.andar(Direcao.LESTE);
//		System.out.println(jogador_1.x);
//		System.out.println(jogador_1.y);
	}
}
