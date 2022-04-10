package estruturasDeControles;

import java.util.Random;
import java.util.Scanner;

public class Questao01 {

	/*
	 * 1 . Escreva um programa Java que gera um n�mero aleat�rio (rand�mico) entre 0
	 * e 10 (incluindo estes dois valores) e pe�a ao usu�rio para adivinh�-lo. Use
	 * um la�o while para registrar as tentativas feitas e, a cada tentativa, d�
	 * dicas informando se o n�mero gerado � maior ou menor que a tentativa feita.
	 * Finalmente mostre a quantidade de tentativas feitas at� que o n�mero fosse
	 * acertado.
	 */

	public static void main(String[] args) {
		Random random = new Random();

		int numeroAleatorio = random.nextInt(10);
		int chuteNumerico = 0;
		int qntDeTentativas = 0;
		boolean acertou = false;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Acerte o valor aleat�rio. \n");

		while (!acertou) {
			System.out.println("Digite um n�mero que vc acha que �: ");
			chuteNumerico = scanner.nextInt();
			qntDeTentativas++;

			if (numeroAleatorio == chuteNumerico) {
				System.out.println("Parab�ns, voc� Acertou :)");
				System.out.println("Numero de tentativas feitas: " + qntDeTentativas);
				acertou = true;
			} else if (chuteNumerico > numeroAleatorio) {
				System.out.println("Vc errou, o numero aleatorio � menor um pouco :( \n");
			} else if (chuteNumerico < numeroAleatorio) {
				System.out.println("Vc errou, o numero aleatorio � maior um pouco :( \n");
			}
		}
		scanner.close();
	}
}
