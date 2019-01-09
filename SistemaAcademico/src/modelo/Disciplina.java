package modelo;

public class Disciplina {

	private String nome;
	private String codigo;
	private String sala;
	private String cargaHoraria;
	private String horario;
	private String custo;
	private Professor professor;
	
	
	public Disciplina() {}
	public Disciplina(String nome, String codigo, String sala, String cargaHoraria, String horario, String custo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.sala = sala;
		this.cargaHoraria = cargaHoraria;
		this.horario = horario;
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
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getCusto() {
		return custo;
	}
	public void setCusto(String custo) {
		this.custo = custo;
	}
	
	
	public void custo() {
		
		
	}
	

	@Override
	public String toString() {
		return  "================ DISCIPLINA ================"
				+ "\nNome=" + nome 
				+ ",\nCodigo=" + codigo 
				+ ",\nSala=" + sala 
				+ ",\nCargaHoraria=" + cargaHoraria
				+ ",\nHorario=" + horario 
				+ ",\nCusto=" + custo 
				+ ",\nProfessor=" + professor
	            + "\n=======================================";
	
	}
	
	
}
