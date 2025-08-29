package exerciciosjava;

import java.util.Scanner;

public class ForeForeach {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float notas[] = new float[5];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite as notas do aluno: ");
			notas[i] = scan.nextFloat();
		}
		
		for (float nota: notas) {
			System.out.println(nota);
		}

	}

}
