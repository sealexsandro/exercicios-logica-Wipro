package estruturasDeControles;

import java.util.Scanner;

public class Questao02 {

	/*
	 * 2. Faça um programa para receber o nome de um aluno e informar 2 notas, em
	 * seguida calcular a média do aluno e apresentar ao final a média calculada e a
	 * situação de Aprovação do aluno. (aprovado com média >= 6).
	 */

	public static void main(String[] args) {

		String nomeDoAluno;
		float nota1;
		float nota2;
		float nota3;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		nomeDoAluno = scanner.nextLine();

		System.out.println("Digite a nota 1: ");
		nota1 = scanner.nextFloat();
		System.out.println("Digite a nota 2: ");
		nota2 = scanner.nextFloat();
		System.out.println("Digite a nota 3: ");
		nota3 = scanner.nextFloat();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 6) {
			System.out.println("O aluno " + nomeDoAluno + " foi Aprovado!");
		} else if (media >= 3 && media < 6) {
			System.out.println("O aluno " + nomeDoAluno + " está de Recuperação!");
		} else {
			System.out.println("O aluno " + nomeDoAluno + " foi Reprovado!");
		}

		scanner.close();
	}
}
