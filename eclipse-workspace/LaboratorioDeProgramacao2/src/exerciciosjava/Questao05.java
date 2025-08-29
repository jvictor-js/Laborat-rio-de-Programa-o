package exerciciosjava;

import java.util.Scanner;

public class Questao05 {

	static class Registro {
        String nome;
        String autor;
        int ano;
        float preco;
    }

    public static Registro registrofilme() {
        Scanner sc = new Scanner(System.in);
        
        Registro end = new Registro();

        System.out.print("Informe qual o nome do filme: ");
        end.nome = sc.nextLine();

        System.out.print("Informe qual o nome do autor: ");
        end.autor = sc.nextLine();

        System.out.print("Informe qual o ano de lançamento: ");
        end.ano = sc.nextInt();

        System.out.print("Informe qual o preço do filme: ");
        end.preco = sc.nextFloat();
        
        return end;
    }

    public static void main(String[] args) {
    	Registro end = registrofilme();
        System.out.println("Nome: " + end.nome);
        System.out.println("Autor: " + end.autor);
        System.out.println("Ano: " + end.ano);
        System.out.println("Preço: " + end.preco);
    }
}
