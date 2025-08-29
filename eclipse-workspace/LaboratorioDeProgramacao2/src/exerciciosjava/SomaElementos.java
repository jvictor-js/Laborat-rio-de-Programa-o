package exerciciosjava;

public class SomaElementos {

	public static void main(String[] args) {
		int lista[] = new int[] {3, 51, 18, 2, 45};
		
		int soma = 0;
		
		for (int i = 0; i < lista.length; i++) {
			soma += lista[i];
		}
		System.out.println("A soma dos elementos é: " + soma);
	}

}
