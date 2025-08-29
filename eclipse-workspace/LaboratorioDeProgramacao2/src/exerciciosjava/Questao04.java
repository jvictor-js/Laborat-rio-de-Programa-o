package exerciciosjava;

import java.util.Scanner;

public class Questao04 {
	
	public static void menu() {
		System.out.println("Escolha uma das seguintes opções: ");
		System.out.println(" a - O número de caracteres da string. ");
		System.out.println(" b - A String com todas suas letras em maiúsculo. ");
		System.out.println(" c - A String com todas suas letras em minúsculo. ");
		System.out.println(" d - O número de vogais da string. ");
		System.out.println(" e - Se a String digitada começa com “UE” (ignorando maiúsculas/minúsculas). ");
		System.out.println(" f - Imprimir a String de maneira inversa. ");
	}

	public static void main(String[] args) {
		menu();
		Scanner sc = new Scanner(System.in);
		System.out.println("Faça sua escolha: ");
		String escolha = sc.nextLine().toLowerCase();
		
		switch (escolha) {
		case "a": 
			System.out.println("Informe uma palavra: "); 
			String palavraa = sc.nextLine(); 
			System.out.printf("A palavra %s tem %d caracteres! \n", palavraa, palavraa.length()); 
			break;
			
		case "b":
			System.out.println("Informe uma palavra: ");
			String palavrab = sc.nextLine();
			System.out.printf("A palavra %s em maiúsculo fica: %s\n", palavrab, palavrab.toUpperCase());
			break;
			
		case "c":
			System.out.println("Informe uma palavra: ");
			String palavrac = sc.nextLine();
			System.out.printf("A palavra %s em minúsculo fica: %s\n", palavrac, palavrac.toLowerCase());
			break;
			
		case "d":
			System.out.println("Informe uma palavra: ");
			String palavrad = sc.nextLine().toLowerCase();
			int countvog = 0;
			for (int i = 0; i < palavrad.length(); i++) {
				char c = palavrad.charAt(i);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					countvog++;
				}
			}
			System.out.printf("A palavra %s tem %d vogais! \n", palavrad, countvog);
			break;
			
		case "e":
			System.out.println("Informe uma palavra: "); 
			String palavrae = sc.nextLine().toUpperCase();
			if (palavrae.startsWith("UE")) {
				System.out.printf("A string %s começa com UE.%n", palavrae);
			} else {
				System.out.printf("A string %s não começa com UE.%n", palavrae);
			}
			break;
			 
		case "f":
			System.out.println("Informe uma palavra: "); 
			String palavraf = sc.nextLine();
			String invertida = new StringBuilder(palavraf).reverse().toString();
			System.out.printf("A palavra %s invertida fica: %s\n", palavraf, invertida);
			break;
			
		default:
			System.out.println("Opção inválida!");
		}
		
	}
}
