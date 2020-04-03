package br.ucsal.banco.modelo;

public class ContaPoupanca extends Conta {

	private int dia;
	private double taxa;

	public ContaPoupanca(String numero, String agencia, String nome) {
		super(numero, agencia, nome);
		this.setDia(1);
		this.taxa = 0.05;
	}

	public void redimento() {
		super.saldo = super.saldo * taxa + super.saldo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	@Override
	public Boolean saque(double valor) {
		redimento();
		Boolean feito = false;
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			feito = true;
		}
		return feito;
	}
	
	@Override
	public String toString() {
		return super.toString() +"[ taxa ="+taxa+" ]";
	}

}
