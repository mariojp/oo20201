package br.ucsal.banco.modelo;

public class ContaCorrente extends Conta {
	
	private Double limite;

	
	public ContaCorrente(String numero, String agencia, String nome, Double limite) {
		super(numero, agencia, nome);
		this.limite = limite;
	}
	
	public ContaCorrente(String numero, String agencia, String nome) {
		this(numero, agencia, nome,0d);
		//this.limite = 0;
	}
	
	
	@Override
	public Boolean saque(double valor) {
		Boolean feito = false;
		if (this.saldo + this.limite >= valor) {
			this.saldo = this.saldo - valor;
			feito = true;
		} 
		return feito;
	}
	
	@Override
	public String toString() {
		return super.toString() +"[ limite ="+limite+ "]";
	}

}
