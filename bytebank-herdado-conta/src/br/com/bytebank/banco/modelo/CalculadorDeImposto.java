package br.com.bytebank.banco.modelo;

//br.com.bytebank.banco.modelo.CalculadorDeImposto => FQN
public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(ContaCorrente cc) {
		double valor = cc.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
