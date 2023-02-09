package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 *
 * @author Stefany
 * @param <T>
 *
 */

public abstract class Conta<T> extends Object implements Comparable<T> {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/**
	 * Construtor para inicializar o objeto a partir da agencia e numero.
	 * 
	 */
	

	public Conta() {

	}

	public Conta(int agencia, int numero) {
		total++;
		System.out.println("o total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
	}

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo;
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor " + valor);

		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public String toString() {
		return "Numero: " + this.numero + " Angencia, " + this.agencia;
	}


	public boolean ehIgual(Conta outra) {
		if(this.agencia != outra.agencia) {
            return false;
        }

        if(this.numero != outra.numero) {
            return false;
        }
        
        return true;

	}
	
	@Override
    public boolean equals(Object ref) {

            Conta outra = (Conta) ref;

            if(this.agencia != outra.agencia) {
                return false;
            }

            if(this.numero != outra.numero) {
                return false;
            }

            return true;
    }

}


