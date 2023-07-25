package br.com.main;

import br.com.classes.veiculo;

public class main {

	public static void main(String[] args) {
		
	//iniciando objeto
	veiculo carro = new veiculo();
	carro.nome = "Corsa";
	carro.cor = "Prata";
	carro.motor = "16cv";
	carro.velocidade = 100;
	
	System.out.println("Nome:" + carro.nome);
	System.out.println("Cor:" + carro.cor);
	System.out.println("Motor:" + carro.motor);
	System.out.println("Velocidade:" + carro.velocidade);
	
	carro.ligar();
	

	
	
	}

}
