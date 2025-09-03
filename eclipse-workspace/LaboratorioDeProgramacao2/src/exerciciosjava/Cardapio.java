package exerciciosjava;
import java.util.Scanner;
public class Cardapio {
	
	public static void menu() {
		System.out.println("------ Opções de lanche ------");
		System.out.println("1 - X-Burger ");
		System.out.println("2 - X-Salada ");
		System.out.println("3 - Refrigerante ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um dos itens: ");
		int escolha = sc.nextInt();
		switch (escolha) {
			case 1: {
				System.out.println("O X-Burger é 12,00R$, terminar pedido");
				;
			}
			default:
				System.out.println("Opção inválida!");
			}
	}
}
