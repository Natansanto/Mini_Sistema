package service;

import java.util.ArrayList;

import classes.sistema.Aluno;

public class AlunoService {
  ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
  
	
	//CRUD
	
	public void addAluno(String nome, String cpf, String matricula, String endereco, String email, String telefone) {
		Aluno aluno = new Aluno(nome,cpf,matricula,endereco,email,telefone);
		alunos.add(aluno);
			
	}
	
	public void listAluno() {
		System.out.println("\n=========== LISTA DE ALUNOS  ===========");
		for(Aluno a: alunos) {
			System.out.println(a);
		}
		System.out.println("Total de alunos cadastros: " + alunos.size());
			
	}
	
	
	
	public void editarAluno(Aluno novo, String nome) {
		  novo.setNome(nome);
		}
	
	
	public Aluno buscarAluno(String matricula) {
		 for(Aluno a: alunos ) {
				if(a.getMatricula().equals(matricula)) {
					return a;
				
		}
	    System.out.println("Matrícula do aluno não encontrada: ");		
	}    
	
	 return null;
   		
 }
	
	public void excluirAluno(String excluirMatricula) {
		System.out.println("================ EXCLUIR ================");
		 Aluno a = buscarAluno(excluirMatricula);
		 if(alunos.remove(a) == true) {
			 System.out.println("Aluno excluído com sucesso: ");
		 }		
	}
	
}