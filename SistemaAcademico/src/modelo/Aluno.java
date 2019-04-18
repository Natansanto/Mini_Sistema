package modelo;

import java.util.ArrayList;

public class Aluno extends Pessoa {

	private String matricula;
	private String situacao;
	private Curso curso;
	ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public Aluno() {
	}

	public Aluno(String nome, String cpf, String matricula, String endereco, String email, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}

	public String getsituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "================ ALUNO ================" 
				+ "\nNome do aluno: " + nome 
				+ ",\nCPF do aluno: " + cpf
				+ ",\nMatricula: " + matricula 
				+ ",\nEndereço: " + endereco 
				+ ",\nEmail: " + email 
				+ ",\nTelefone: "+ telefone + 
				"\n=======================================";
	}

}
