package br.ucsal.banco.modelo;

public abstract class Conta implements Comparable<Conta>{

	private String numero;
	private String agencia;
	private String nome;
//	private Double saldo;
	protected Double saldo;

	public Conta(String numero, String agencia, String nome, Double saldo) {
		this.numero = numero + "-X";
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}

	
	public Conta(String numero, String agencia, String nome) {
		this(numero, agencia, nome, 0d);
//		this.numero = numero+"-X";
//		this.agencia = agencia;
//		this.nome = nome;
//		this.saldo = 0d;
	}

//	public Conta() {
//		// TODO Auto-generated constructor stub
//	}

	public abstract Boolean saque(double valor);

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
		return this.saldo;
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

	public String getNumero() {
		return numero;
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Conta o = (Conta) obj;
		return this.nome.equals(o.getNome());
	}
	
	@Override
	public int compareTo(Conta o) {
		return this.nome.compareTo(o.getNome());
	}


	@Override
	public String toString() {
		return "Conta nome=" + nome + ",numero=" + numero + ", agencia=" + agencia + ",  saldo=" + saldo ;
	}
	
	
	

}
