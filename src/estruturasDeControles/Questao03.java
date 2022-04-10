package estruturasDeControles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao03 {

	/*
	 * 3. Faça um programa para receber os nomes de 4 candidatos a líder de uma
	 * turma, em seguida receber os votos dos alunos existentes na sala, e ao final
	 * mostrar o total de votos de cada candidato e ainda o candidato vencedor da
	 * eleição.
	 */

	public static void main(String[] args) {

		List<String> nomesCandidatos = new ArrayList<>();
		List<Integer> votosDosCandidatos = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o nome do Candidato " + (i + 1) + " :");
			nomesCandidatos.add(scanner.nextLine());
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite a quantidade de votos do Candidato " + (i + 1) + " :");
			votosDosCandidatos.add(scanner.nextInt());
		}

		int indiceDoCampeao = -1;

		if (votosDosCandidatos.get(0) > votosDosCandidatos.get(1)
				&& votosDosCandidatos.get(0) > votosDosCandidatos.get(2)
				&& votosDosCandidatos.get(0) > votosDosCandidatos.get(3)) {
			indiceDoCampeao = 0;
		} else if (votosDosCandidatos.get(1) > votosDosCandidatos.get(0)
				&& votosDosCandidatos.get(1) > votosDosCandidatos.get(2)
				&& votosDosCandidatos.get(1) > votosDosCandidatos.get(3)) {
			indiceDoCampeao = 1;
		} else if (votosDosCandidatos.get(2) > votosDosCandidatos.get(0)
				&& votosDosCandidatos.get(2) > votosDosCandidatos.get(1)
				&& votosDosCandidatos.get(2) > votosDosCandidatos.get(3)) {
			indiceDoCampeao = 2;
		} else if (votosDosCandidatos.get(3) > votosDosCandidatos.get(0)
				&& votosDosCandidatos.get(3) > votosDosCandidatos.get(1)
				&& votosDosCandidatos.get(3) > votosDosCandidatos.get(2)) {
			indiceDoCampeao = 3;
		}

		if (indiceDoCampeao > -1) {
			System.out.println("\nNome do Vencedor: " + nomesCandidatos.get(indiceDoCampeao) + ", quantidade de votos: "
					+ votosDosCandidatos.get(indiceDoCampeao));
		} else {
			System.out.println("\n******  Empate Técnico dos 4 candidatos **********");
		}

		for (int i = 0; i < 4; i++) {
			if (i != indiceDoCampeao) {
				System.out.println(
						"Candidato  " + nomesCandidatos.get(i) + ", quantidade de votos: " + votosDosCandidatos.get(i));
			}

		}
		scanner.close();
	}
}
