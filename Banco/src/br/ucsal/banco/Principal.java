package br.ucsal.banco;

import br.ucsal.banco.modelo.Conta;

public class Principal {

	public static void main(String[] args) {
		
		
		
		Conta c1 = new Conta("007","2222","Pedro");
//		Conta c1 = new Conta("007","2222","Pedro",0d);
//		c1.nome = "Pedro";
//		c1.agencia = "007";
//		c1.numero = "2222";
//		c1.saldo = 0d;// ponto flutuante / double - d
		
		Conta c2 = new Conta("004","4646","Maria",1000d);
//		c2.nome = "Maria";
//		c2.agencia = "004";
//		c2.numero = "4646";
//		c2.saldo = 1000.0; // ponto flutuante
		
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

		
		
		
	}

}
