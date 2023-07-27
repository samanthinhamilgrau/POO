package br.com.classes;

public class Diarista extends Pessoa{
	

	protected String chavePix;
	
	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

	public void atender(String nomeCliente) {
		
		System.out.println("Realizando atendimento para cliente: " + nomeCliente);
	}

	@Override
	public void sacar(int valor) {
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual - valor;
		this.setSaldo(novoSaldo);
		
		
	}

	@Override
	public void depositar(int valor) {
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual + valor;
		this.setSaldo(novoSaldo);
		
	}
 
}
