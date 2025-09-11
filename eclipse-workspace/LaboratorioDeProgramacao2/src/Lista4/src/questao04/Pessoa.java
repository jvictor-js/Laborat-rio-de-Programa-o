package questao04;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private Carro carro;
	
	Scanner sc = new Scanner(System.in);
	Scanner scN = new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public void nomeDaPessoa() {
		System.out.println("--- Dados da pessoa ---");
		System.out.println("Informe seu nome: ");
		nome = sc.nextLine();
	}
	
	public void ligarCarro() {
		carro.ligar();
	}
	
	public void frearCarro() {
		carro.frear();
	}
	
	public void desligarCarro() {
		carro.desligar();
	}
	
	@Override
	public String toString(){
		return nome;
	}
	
}
