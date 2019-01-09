package service;
import java.util.ArrayList;

import modelo.Curso;

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
	
	
	public void editCurso() {
		
		
		
		
		
	}
	
	
	
}
