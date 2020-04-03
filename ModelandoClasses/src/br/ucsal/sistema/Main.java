package br.ucsal.sistema;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.sistema.modelo.Cidade;
import br.ucsal.sistema.modelo.Cliente;
import br.ucsal.sistema.modelo.Estado;

public class Main {

	
	public static void main(String[] args) {
		List<Cidade> cidades = new ArrayList<>();
//		cidades.add(new Cidade("ssa", "Salvador"));
//		cidades.add(new Cidade("fds", "Feira de Santana"));
//
		Cidade rio = new Cidade("rj", "Rio de Janeiro",new Estado("RJ", "RIO DE JANEIRO"));
		
		cidades.add(rio);
//		cidades.add(new Cidade("sp", "São Paulo"));
//		cidades.add(new Cidade("for", "Fortaleza"));

		List<Estado> estados = new ArrayList<>();
		Estado bahia = new Estado("BA", "BAHIA");
		new Cidade("ssa", "Salvador",bahia);
		new Cidade("fds", "Feira de Santana",bahia);

		estados.add(bahia);
		estados.add(new Estado("RJ", "RIO DE JANEIRO"));
		estados.add(new Estado("SP", "SAO PAULO"));
		estados.add(new Estado("CE", "CEARA"));

		
		//Direcional cidade para estado
		Cliente cliente = new Cliente();
		cliente.setNome("Pedro");
		cliente.setCidade(rio);
		cliente.getCidade().getEstado();		
		
		for (Cidade cidade : cidades) {
			if(cidade.getEstado().equals(bahia)) {
				System.out.println(cidade);
			}
		}
		
		//Direcional estado para cidade
		bahia.getCidades();
		
		
		
		for (Estado estado : estados) {
			System.out.println(estado);
		}
		
		
		
		
	}
}
