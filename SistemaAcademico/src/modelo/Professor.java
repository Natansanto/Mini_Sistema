package modelo;

public class Professor extends Pessoa {


	private String categoria;
	private Disciplina disciplina;
	
	
	public Professor() {}
	public Professor(String nome, String cpf, String endereco, String email, String telefone, String categoria) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.categoria = categoria;
	}
	
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "================ PROFESSOR ================"
				+ "\nNome: = " + nome 
				+ ",\nCpf: = " + cpf 
				+ ",\nEndereco: = " + endereco 
				+ ",\nEmail: = " + email
				+ ",\nTelefone: = " + telefone 
				+ ",\nCategoria: = " + categoria 
				+ ",\nDisciplina administrada pelo professor: = " + disciplina
		        + "\n=======================================";
	}
	
	
	
	
}	
