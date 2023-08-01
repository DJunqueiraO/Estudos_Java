package exercices.java_exercices_OO.structured_logic.loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        _2(input);
        input.close();
    }
//1) Fazer uma classe Ex1Primos para:
//            • Receber um inteiro N do usuário
//            • Testar se este inteiro é primo ou não e informar
    private static void _1() {
        var ex1primos = new Ex1Primos(4);
        ex1primos.showNumberIsPrime();
        Ex1Primos.showNumberIsPrime(3);
        Ex1Primos.showPrimesAtInterval(0, 100);
    }
//2) Fazer uma classe Ex2Sorteio para:
//            • Sortear um número de 0 a 1000 (dica: usar Math.random())
//            • Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
//    menor do que o número sorteado.
//            • Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
//    quantas tentativas ele acertou.
    private static void _2(Scanner input) {
        var randomNumber = Ex2Sorteio.generateNumber(0, 1000);
        var numberOfAttempts = 1;
        do {
            System.out.println("Foi gerado um número aleatório de 0 a 1000, tente descobrir qual é.");
            System.out.print("Informe um número: ");
            try {
                var number = Integer.parseInt(input.next());
                if(number == randomNumber) {
                    System.out.println("Voce acertou!!!");
                    System.out.printf("E precisou de %d tentativas pra isso.", numberOfAttempts);
                    break;
                }
                var numberIs = number > randomNumber? "maior" : "menor";
                System.out.println("Voce errou!! Esse número é " + numberIs + " que o número gerado.");
                numberOfAttempts++;
            } catch (Exception exception) {
                System.out.println("Voce informou um valor inválido.");
            }
        } while(true);
    }
//3) Fazer um programa para receber dois números do tipo int do usuário e
//    determinar se um número é permutação do outro ou não. Ex: 431 é permutação
//    de 143, 42 é permutação de 204, 1211 é permutação de 1112, etc. O programa
//    só deve aceitar números positivos.
//4) Fazer um programa para medir os reflexos do usuário. O programa deve:
//            • Mostrar a palavra “Agora!” após um tempo aleatório e um número,
//    também aleatório
//            • Contar o tempo até que o usuário digite o número pedido e mostrar esse
//    tempo.
//            • Dicas: usar o método getTimeInMillis da classe Calendar ou o método
//    nanoTime da classe System.
}
