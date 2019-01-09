package modelo;

import java.util.ArrayList;

public class Curso {

	private String nome;
	private String codigo;
	private String turno;
	private String ProfessorCoordenador;
	ArrayList<Disciplina> grade = new ArrayList<Disciplina>();
	
	
	public Curso() {}
	public Curso(String nome, String codigo, String turno, String professorCoordenador) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.turno = turno;
		ProfessorCoordenador = professorCoordenador;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getProfessorCoordenador() {
		return ProfessorCoordenador;
	}
	public void setProfessorCoordenador(String professorCoordenador) {
		ProfessorCoordenador = professorCoordenador;
	}
	
	@Override
	public String toString() {
		return "================ CURSO ================"
				+ "\nNome: = " + nome 
				+ ",\nCodigo: = " + codigo 
				+ ",\nTurno: = " + turno 
				+ ",\nProfessorCoordenador: = " + ProfessorCoordenador 
				+ ",\nLista de disciplinas: = " + grade
		        + "\n=======================================";
	}
	
	
	
	

}
