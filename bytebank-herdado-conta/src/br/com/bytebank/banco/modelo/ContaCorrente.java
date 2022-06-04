package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.modelo.ContaCorrente.Tributavel;

//new ContaCorrente()
public class ContaCorrente extends Conta {

	public interface Tributavel {

	}

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	@Override
	public double getValorImposto() {	
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}
	
}
