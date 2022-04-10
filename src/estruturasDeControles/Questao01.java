package estruturasDeControles;

import java.util.Random;
import java.util.Scanner;

public class Questao01 {

	/*
	 * 1 . Escreva um programa Java que gera um número aleatório (randômico) entre 0
	 * e 10 (incluindo estes dois valores) e peça ao usuário para adivinhá-lo. Use
	 * um laço while para registrar as tentativas feitas e, a cada tentativa, dê
	 * dicas informando se o número gerado é maior ou menor que a tentativa feita.
	 * Finalmente mostre a quantidade de tentativas feitas até que o número fosse
	 * acertado.
	 */

	public static void main(String[] args) {
		Random random = new Random();

		int numeroAleatorio = random.nextInt(10);
		int chuteNumerico = 0;
		int qntDeTentativas = 0;
		boolean acertou = false;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Acerte o valor aleatório. \n");

		while (!acertou) {
			System.out.println("Digite um número que vc acha que é: ");
			chuteNumerico = scanner.nextInt();
			qntDeTentativas++;

			if (numeroAleatorio == chuteNumerico) {
				System.out.println("Parabéns, você Acertou :)");
				System.out.println("Numero de tentativas feitas: " + qntDeTentativas);
				acertou = true;
			} else if (chuteNumerico > numeroAleatorio) {
				System.out.println("Vc errou, o numero aleatorio é menor um pouco :( \n");
			} else if (chuteNumerico < numeroAleatorio) {
				System.out.println("Vc errou, o numero aleatorio é maior um pouco :( \n");
			}
		}
		scanner.close();
	}
}
