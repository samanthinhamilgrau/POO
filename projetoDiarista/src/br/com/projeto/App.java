package br.com.projeto;

import br.com.classes.Cliente;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {
		
		Diarista diarista = new Diarista();
		
		diarista.nome = "João da Silva";
		diarista.telefone = "(11) 98751-9885";
		diarista.endereço = "Av Cajamar, N 111";
		diarista.chavePix = "150";
		
		
		System.out.println("NOME DIARISTA:" + diarista.nome);
		System.out.println("TELEFONE DIARISTA:" + diarista.telefone);
		System.out.println("ENDEREÇO DIARISTA:" + diarista.endereço);
		System.out.println("CHAVE PIX DIARISTA:" + diarista.chavePix);
		diarista.atender("Jóse");
		
		System.out.println("==================================");
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "José";
		cliente.telefone = "(11) 98557-6247";
		cliente.endereço = "Av Cajamar, N 501";		
		cliente.saldo = 1000.000;
		
		System.out.println("NOME CLIENTE:" + cliente.nome);
		System.out.println("TELEFONE CLIENTE:" + cliente.telefone);
		System.out.println("ENDEREÇO CLIENETE:" + cliente.endereço);
		System.out.println("SALDO CLIENETE:" + cliente.saldo);
		
	}

}
