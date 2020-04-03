package br.ucsal.sistema.modelo;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	
	
	private String uf;
	private String nome;
	private List<Cidade> cidades = new ArrayList<>();

	public Estado(String uf, String nome) {
		super();
		this.uf = uf;
		this.nome = nome;
	}
	
	

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}


	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}



	@Override
	public String toString() {
		String string = "Estado [uf=" + uf + ", nome=" + nome +"\n";
		for (Cidade cidade : cidades) {
			string = string + cidade.toString() +"\n";
		}
		return string;
	}
	

	
	




	
	
	

}
