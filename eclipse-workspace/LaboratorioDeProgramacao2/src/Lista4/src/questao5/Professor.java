package questao5;

import java.util.Scanner;

public class Professor {
	private String nome;
	private String departamento;
	private String email;
	
	Scanner sc = new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void adicionarProfessor() {
		System.out.println("Informe o nome do professor: ");
		nome = sc.nextLine();
		System.out.println("Informe seu departamento: ");
		departamento = sc.nextLine();
		System.out.println("Informe seu email: ");
		email = sc.nextLine();
	}
	
	
}
