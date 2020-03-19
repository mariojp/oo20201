package br.ucsal.banco;

import br.ucsal.banco.modelo.Conta;
import br.ucsal.banco.modelo.ContaCorrente;
import br.ucsal.banco.modelo.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		
		
		Conta[] contas = new Conta[3];
		
		
		ContaCorrente c1 = new ContaCorrente("007","2222","Pedro");
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
		
		contas[0] = c1;
		contas[1] = c2;
		contas[2] = cp3;
				
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
		
		for (Conta conta : contas) {
			System.out.println(conta.getNome());
			System.out.println(conta.getNumero());
			System.out.println(conta.getAgencia());
			conta.saque(10d);
			if(conta instanceof ContaPoupanca ) {
				ContaPoupanca cp = (ContaPoupanca) conta;
				cp.redimento();
				//((ContaPoupanca) conta).redimento();
			}
			System.out.println("Saldo:"+ conta.getSaldo() );
		}
		

	}

}
