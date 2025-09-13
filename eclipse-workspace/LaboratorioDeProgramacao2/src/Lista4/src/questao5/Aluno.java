package questao5;

import java.util.Scanner;

public class Aluno {
	private String nomeAluno;
	private String matricula;
	private double n1, n2, n3, n4;
	private double media;
	
	Scanner sc = new Scanner(System.in);
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNome(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public double getN4() {
		return n4;
	}
	
	public void setN4(double n4) {
		this.n4 = n4;
	}
	
	public void setMedia(double Media) {
		this.media = Media;
	}
	
	public double getMedia() {
		return media;
	}
	public void adicionandoAluno() {
		System.out.println("Informe seu nome: ");
		nomeAluno = sc.nextLine();
		System.out.println("Informe sua matrícula: ");
		matricula = sc.nextLine();
		System.out.println("Informe sua primeira nota: ");
		n1 = sc.nextDouble();
		System.out.println("Informe sua segunda nota: ");
		n2 = sc.nextDouble();
		System.out.println("Informe sua terceira nota: ");
		n3 = sc.nextDouble();
		System.out.println("Informe sua quarta nota: ");
		n4 = sc.nextDouble();
	}
	
	public void calculandoMediaAluno() {
		media = (n1+n2+n3+n4) / 4;
		if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado");
		}
	}
	
}
