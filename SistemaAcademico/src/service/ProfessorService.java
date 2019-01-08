package service;
import java.util.ArrayList;

import modelo.Professor;

public class ProfessorService {
 
	ArrayList<Professor> professores = new ArrayList<Professor>();
	
	
	//CRUD
	
	public void addProfessor(String nome, String cpf, String endereco, String email, String telefone, String categoria) {
	Professor professor = new Professor(nome,cpf,endereco,email,telefone,categoria);
	professores.add(professor);
			
	}
	
	
	public void listProfessores() {
		System.out.println("\n=========== LISTA DE PROFESSORES  ===========");
		for(Professor p: professores) {
			System.out.println(p);
			
		}
		System.out.println("Total de professores cadastros: " + professores.size());
	}
	
	
	public Professor buscarProfessor(String cpf) {
		for(Professor p : professores) {
			if(p.getCpf().equals(cpf)) {
				return p;
			}
		
			System.out.println("Professor não encontrado: ");
		}
		
		  return null; 
}
	
		
	public void excluirProfessor(String excluirCpf) {
		System.out.println("================ EXCLUIR ================");
		Professor p = buscarProfessor(excluirCpf);
		if(professores.remove(p) == true) {
			 System.out.println("Professor excluído com sucesso: ");
		}
		
		
	}
	
}
