package exerciciosjava;

import java.util.Scanner;

class Bandas {

	String nomeBanda;
	String tipoMusica;
	int numIntegrantes;
	
}

public class RegistroBandas {


	public static Bandas cadastroBanda() {
		Scanner sc = new Scanner(System.in);
		Scanner sci = new Scanner(System.in);
		Bandas banda = new Bandas();
		System.out.println("Informe o nome da banda: ");
		banda.nomeBanda = sc.nextLine();
		System.out.println("Informe qual o tipo de música ela toca: ");
		banda.tipoMusica = sc.nextLine();
		System.out.println("Informe o número de integrantes da banda: ");
		banda.numIntegrantes = sci.nextInt();
		System.out.printf("A banda %s foi cadastrada com sucesso \n", banda.nomeBanda);
		return banda;
		
	}
	
	public static void imprimeBandas(Bandas banda) {
		System.out.println("Banda: " + banda.nomeBanda);
		System.out.println("Tipo de música: " + banda.tipoMusica);
		System.out.println("Número de integrantes: " + banda.numIntegrantes);
	}
	public static void main(String[] args) {
		Bandas banda = cadastroBanda();
		imprimeBandas(banda);

	}

}
