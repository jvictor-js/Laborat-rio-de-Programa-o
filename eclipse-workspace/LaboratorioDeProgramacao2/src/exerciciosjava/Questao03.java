package exerciciosjava;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma palavra: ");
		String str1 = sc.nextLine();
		System.out.println("Informe uma palavra: ");
		String str2 = sc.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println("As palavras são iguais!");
		} else {
			String strresultante = str1.concat(str2);
			System.out.println(strresultante);
		}
		
	}

}
