package br.ucsal.banco.modelo;

public class ContaInvestimento extends Conta {

	
	private double taxaCompra = 5.20;
	private double taxaVenda  = 5.00;
	
	public ContaInvestimento(String numero, String agencia, String nome) {
		super(numero, agencia, nome);
	}

	//Sobresrever obrigatoriamente porque meu metodo da classe pai é abstrato;
	@Override
	public Boolean saque(double valor) {
		Boolean feito = false;
		Double saldoReais = this.saldo*taxaVenda;
		if (saldoReais >= valor) {
			saldoReais = saldoReais - valor;
			saldo = saldoReais/taxaCompra;
			feito = true;
		}
		return feito;	
	}
	
	
	@Override
	public void deposito(double valor) {
		super.deposito((valor/taxaCompra));
	}
	
	
	@Override
	public Double saldo() {
		return this.saldo*taxaVenda;
	}
	
	

}
