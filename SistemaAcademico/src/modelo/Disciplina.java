package modelo;

public class Disciplina {

	private String nome;
	private String codigo;
	private String sala;
	private String cargaHoraria;
	private String Horario;
	private String custo;
	private Professor professor;
	
	
	public Disciplina() {}
	public Disciplina(String nome, String codigo, String sala, String cargaHoraria, String horario, String custo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.sala = sala;
		this.cargaHoraria = cargaHoraria;
		Horario = horario;
		this.custo = custo;
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
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getHorario() {
		return Horario;
	}
	public void setHorario(String horario) {
		Horario = horario;
	}
	public String getCusto() {
		return custo;
	}
	public void setCusto(String custo) {
		this.custo = custo;
	}
	
	
}
