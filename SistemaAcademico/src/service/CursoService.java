package service;
import java.util.ArrayList;

import modelo.Curso;
import modelo.Disciplina;

public class CursoService {


	ArrayList<Curso> cursos = new ArrayList<Curso>();

	 
	
	public void addCurso(String nome, String codigo, String turno, String nomeProf) {
		Curso curso = new Curso(nome,codigo,turno,nomeProf);
		cursos.add(curso);
		
	}
	
	
	public void listCurso() {
		System.out.println("\n=========== LISTA DE CURSOS ===========");
		for(Curso c: cursos) {
			System.out.println(c);
		}
			
		System.out.println("Total de cursos cadastrados: " + cursos.size());
		
	}
	
	
	public void editCursoNome(Curso novo, String nome) {
		novo.setNome(nome);		
	}
	public void editCursoCod(Curso novo, String cod) {
		novo.setCodigo(cod);	
	}
	public void editCursoTurno(Curso novo, String turno) {
		novo.setTurno(turno);	
	}
	public void editCursoProf(Curso novo, String prof) {
		novo.setProfessorCoordenador(prof);	
	}
	
	
	 
	
	public Curso buscarCurso(String buscar) {
		for(Curso c: cursos) {
			if(c.getCodigo().equals(buscar)) {
				return c;
			}	
	} System.out.println("Matrícula do curso não encontrada: ");		
		 
		return null; 		
	}
	

	
	public void excluirCurso(String excluir) {
	     Curso c = buscarCurso(excluir);
	     if(cursos.remove(c) == true) {
	    	 System.out.println("Curso excluído com sucesso: ");
	     }
	
	}


	
	
}	
  
