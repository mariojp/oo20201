package br.ucsal.sistema.modelo;

public class Cidade {
	
	private String sigla;
	private String nome;
	private Estado estado;
	
	public Cidade(String sigla, String nome, Estado estado) {
		this.sigla = sigla;
		this.nome = nome;
		this.estado = estado;
		this.estado.getCidades().add(this);
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.sigla +" - "+this.nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
