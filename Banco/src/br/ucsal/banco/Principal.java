package br.ucsal.banco;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import br.ucsal.banco.modelo.Conta;
import br.ucsal.banco.modelo.ContaCorrente;
import br.ucsal.banco.modelo.ContaInvestimento;
import br.ucsal.banco.modelo.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
				
		
		//List<Conta> contas = new ArrayList<Conta>();
		Set<Conta> contas = new HashSet<Conta>();
		//Map<String, Conta> contas = new HashMap<String, Conta>();
		ContaCorrente c1 = new ContaCorrente("007","2222","Pedro");
		ContaCorrente c1c = new ContaCorrente("007","2222","Pedro");
		
		System.out.println("Iguais "+c1.equals(c1c));

//		Conta c1 = new Conta("007","2222","Pedro",0d);
//		c1.nome = "Pedro";
//		c1.agencia = "007";
//		c1.numero = "2222";
//		c1.saldo = 0d;// ponto flutuante / double - d
		

		
		Conta c2 = new ContaCorrente("004","4646","Maria",2000d);
		c2.deposito(1000d);
//		c2.nome = "Maria";
//		c2.agencia = "004";
//		c2.numero = "4646";
//		c2.saldo = 1000.0; // ponto flutuante
		
		
		ContaPoupanca cp3 = new ContaPoupanca("0012", "5555", "Caio");
		cp3.deposito(3000.0);
		
		
		ContaInvestimento ci4 = new ContaInvestimento("0088", "5555", "Jade");
		ci4.deposito(15.60);
		System.out.println(ci4.getSaldo());
		ci4.saque(5.00);

		
//		contas.put(c1.getNome() , c1); //0
//		contas.put(c1.getNome(),c1); //1
//		contas.put(c2.getNome(),c2); //2
//		contas.put(cp3.getNome(),cp3); //3
//		contas.put(cp3.getNome(),cp3); //4
//		contas.put(ci4.getNome(),ci4); //5
		
		contas.add(c1); //0
		contas.add(c1); //1
		contas.add(c1c);
		contas.add(c2); //2
		contas.add(cp3); //3
		contas.add(cp3); //4
		contas.add(ci4); //5
		
		//Indice apenas para lista 
		//Conta removida = contas.remove(1);
		//System.out.println("Removida "+ removida.getNome());
		//Conta obter = contas.get(3);
		//System.out.println("Obter "+ obter.getNome());

		//contas.remove(c1);
		
		//Boolean achou =  contas.containsValue(c1);
		// Integer indice = contas.indexOf(ci4);
		//System.out.println("Esta na lista = "+achou );
		
		// Lista tem tamanho =  6 

		System.out.println(c1.saldo());
		System.out.println(c2.saldo());
		
		//deposito
		//c1.saldo= c1.saldo +100d;
		System.out.println("Deposito c1 "+c1.getNome());
		c1.deposito(100d);
		//saque
		//c1.saldo= c1.saldo - 150d;
		System.out.println("Saque c1 "+c1.getNome()+" " + c1.saque(150d));
		
		//Transferencia
//		c2.saldo= c2.saldo - 1500d;
//		c1.saldo= c1.saldo + 1500d;
		c2.tranferencia(c1, 1500d);

		
		System.out.println(c1.saldo());
		System.out.println(c2.saldo());

		
		System.out.println(cp3.getNome());
		System.out.println(cp3.getNumero());
		System.out.println(cp3.getAgencia());
		
		System.out.println("Saldo:"+ cp3.getSaldo() );
		cp3.redimento();
		System.out.println("Saldo:"+ cp3.getSaldo() );
		
		System.out.println("---- -- ------- ---- -- - - - -- - - ");
				
//		for (int i = 0; i < contas.size(); i++) {
		
//		Iterator<Conta> iterator = contas.iterator();
//		while(iterator.hasNext()) {
//		Conta conta = iterator.next();
		contas.size();
		for (Conta conta : contas) {
			if(conta instanceof ContaPoupanca ) {
				ContaPoupanca cp = (ContaPoupanca) conta;
				//cp.redimento();
				//((ContaPoupanca) conta).redimento();
			}
			System.out.println(conta);
		}
		
		
		

	}

}
