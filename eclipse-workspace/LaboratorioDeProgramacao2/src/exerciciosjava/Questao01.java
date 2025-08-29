package exerciciosjava;

import java.util.Scanner;

public class Questao01 {

		public static int num(int num){
			if(num%2 == 0) {
				return 0;
			}
			else {
				return 1;
			}
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe um número: ");
			int numero = sc.nextInt();
			
			System.out.println(num(numero));
		}


	}

