package classes.sistema;

public class Aluno {
	
	private String nome;
	private String cpf;
	private String matricula;
	private String endereco;
	private String email;
	private String telefone;
	private Curso curso;
	private Disciplina disciplinas;

 

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
 

 
 
	
	
}
