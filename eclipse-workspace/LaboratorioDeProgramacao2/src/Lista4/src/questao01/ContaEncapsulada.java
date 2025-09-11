package questao01;

import java.util.Scanner; 

public class ContaEncapsulada {
	private String nomeDonoConta;
	private String cpf;
	private double saldo;
	
	Scanner sc = new Scanner(System.in);
	Scanner scN = new Scanner(System.in);
	
	public String getNomeDonoConta() {
		return nomeDonoConta;
	}
	public void setNomeDonoConta(String nomeDonoConta) {
		this.nomeDonoConta = nomeDonoConta;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void criarConta() {
		System.out.println("--- Criando Conta ---");
		System.out.println("Informe seu nome: ");
		nomeDonoConta = sc.nextLine();
		System.out.println("Informe seu CPF: ");
		cpf = sc.nextLine();
	}
	
	public void depositar() {
		double valor;
		System.out.println("--- Depositando ---");
		System.out.println("Quanto você deseja depositar? ");
		valor = scN.nextDouble();
		if (valor < 0) {
			System.out.println("Valor inválido!");
		} else {
			saldo += valor;
			System.out.println("Depósito realizado! Saldo atual: " + saldo);
		}
	}
	
	public void sacar() {
		double valor;
		System.out.println("--- Sacando ---");
		System.out.println("Quanto deseja sacar? ");
		valor = scN.nextDouble();
		if (valor < 0) {
			System.out.println("Valor inválido!");
		} else {
			if (valor <= saldo) {
				saldo -= valor;
				System.out.println("Saque realizado!");
			} else {
				System.out.println("Saldo insuficiente!");
			}
		}
	}
	
	public void exibirDados() {
		System.out.println("Nome do dono da conta: " + nomeDonoConta);
		System.out.println("CPF: " + cpf);
		System.out.println("Saldo atual: " + saldo);
	}
	
}
