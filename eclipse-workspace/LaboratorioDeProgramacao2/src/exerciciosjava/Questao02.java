package exerciciosjava;

import java.util.Scanner;

public class Questao02 {

    public static float num(float nota1, float nota2, float nota3, char letra) {
        if (letra == 'A') {
            float media = (nota1 + nota2 + nota3) / 3;
            return media;
        } else if (letra == 'P') {
            float mediap = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;
            return mediap;
        } else {
        	System.out.println("Opção inválida!");
        	return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a nota 1: ");
        float nota1 = sc.nextFloat();

        System.out.println("Entre com a nota 2: ");
        float nota2 = sc.nextFloat();

        System.out.println("Entre com a nota 3: ");
        float nota3 = sc.nextFloat();

        System.out.println("Entre com A ou P: ");
        char letra = sc.next().toUpperCase().charAt(0);

        float resultado = num(nota1, nota2, nota3, letra);
        
        System.out.println(resultado);

    }
}

	


