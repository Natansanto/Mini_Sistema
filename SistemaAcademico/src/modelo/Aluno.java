package modelo;

import java.util.ArrayList;

public class Aluno {
	
	private String nome;
	private String cpf;
	private String matricula;
	private String endereco;
	private String email;
	private String telefone;
	private String situacao;
	private Curso curso;
	ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

 
 public Aluno() {}
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

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
@Override
public String toString() {
	return  "================ ALUNO ================"
		     + "\nNome do aluno: " + nome
		     + ",\nCPF do aluno: " + cpf 
	         + ",\nMatrícula: " + matricula
	         + ",\nEndereço: " + endereco
	         + ",\nEmail: " + email
	         + ",\nTelefone: " + telefone
	         + "\n=======================================";
} 

 
 
	
	
}
