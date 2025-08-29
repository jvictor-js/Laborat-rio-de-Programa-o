package exerciciosjava;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float notas[] = new float[2];
		
		System.out.println("Informe a primeira nota: ");
		notas[0] = scan.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		notas[1] = scan.nextFloat();
		
		float media = (notas[0] + notas[1]) / 2;
		
		System.out.println("Média: " + media);
		
	}

}
