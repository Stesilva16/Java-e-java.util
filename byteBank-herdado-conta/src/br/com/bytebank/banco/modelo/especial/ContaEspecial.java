package br.com.bytebank.banco.modelo.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public void ContaCorrente(int agencia, int numero) {

	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
