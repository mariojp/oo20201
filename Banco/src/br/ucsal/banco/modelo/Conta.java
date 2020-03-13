package br.ucsal.banco.modelo;

public class Conta {

	private String numero;
	private String agencia;
	private String nome;
	private Double saldo;
	private Double limite;

	public Conta(String numero, String agencia, String nome, Double saldo) {
		this.numero = numero + "-X";
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = saldo * 2;
	}

	public Conta(String numero, String agencia, String nome) {
		this(numero, agencia, nome, 0d);
//		this.numero = numero+"-X";
//		this.agencia = agencia;
//		this.nome = nome;
//		this.saldo = 0d;
	}

	public Boolean saque(double valor) {
		Boolean feito = false;
		if (this.saldo+this.limite >= valor) {
			this.saldo = this.saldo - valor;
			feito = true;
		} 
		return feito;
	}

	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
	}

	public Boolean tranferencia(Conta conta, double valor) {
		Boolean retorno = this.saque(valor);
		if(retorno) {
			conta.deposito(valor);
		}
		return retorno;
	}
	
	public Double saldo() {
		return this.saldo+this.limite;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public String getNumero() {
		return numero;
	}
	
	

}
