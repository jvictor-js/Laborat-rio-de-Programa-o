package questao5;

import java.util.Scanner;

public class Curso {
	private String nome;
	private String horario;
	private Professor professor = new Professor();
	private Aluno[] alunos = new Aluno[4];
	private double mediaTurma;
	
	Scanner sc = new Scanner(System.in);
	
	Curso (String nome, String horario){
		this.nome = nome;
		this.horario = horario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public double getMediaTurma() {
		return mediaTurma;
	}
	public void setMediaTurma(double mediaTurma) {
		this.mediaTurma = mediaTurma;
	}
	
	public void registrandoAluno() {
		for(int i = 0; i < 4; i++) {
			alunos[i] = new Aluno();
			alunos[i].adicionandoAluno();
		}
	}
	
	public void registrandoProfessor(){
		professor.adicionarProfessor();
	}
	
	public void mediaAlunos() {
		for (int i = 0; i < 4; i++) {
			alunos[i].calculandoMediaAluno();
		}
	}
	
	public void mediaTurma() {
		int somaMedia = 0;
		for (int i = 0; i < 4; i++) {
			somaMedia += (alunos[i].getMedia());
		}
		mediaTurma = somaMedia / 4;
	}
	
	public void informacoes() {
		System.out.println("Curso: " + nome);
		System.out.println("Horário: " + horario);
		System.out.println("Professor: " + professor.getNome());
		System.out.println("Departamento: " + professor.getDepartamento());
		System.out.println("Email: " + professor.getEmail());
		for (int i = 0; i < 4; i++) {
			System.out.println("Nome do Aluno: " + alunos[i].getNomeAluno());
			System.out.println("Matricula: " + alunos[i].getMatricula());
			System.out.println("Média: " + alunos[i].getMedia());
		}
		System.out.println("Média da turma: " + mediaTurma);
	}
	
}
