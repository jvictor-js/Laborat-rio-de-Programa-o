package exerciciosjava;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[2][2];
		int i = 0, j = 0;
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print("Insira o elemento: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nMatriz digitada: ");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
