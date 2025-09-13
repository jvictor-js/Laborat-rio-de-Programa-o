package questao5;

import java.util.Scanner;

public class MainFacul {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu curso: ");
		String nomeCurso = sc.nextLine();
		
		System.out.println("Informe o horário: ");
		String horarioCurso = sc.nextLine();
		
		Curso curso = new Curso(nomeCurso, horarioCurso);
		
		curso.registrandoProfessor();
		curso.registrandoAluno();
		curso.mediaAlunos();
		curso.mediaTurma();
		curso.informacoes();

	}

}
