package br.com.projeto;


import br.com.classes.Atendimento;
import br.com.classes.Cliente;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {
		
		
		Diarista diarista = new Diarista();
		
		diarista.setNome("João da Silva"); 
		diarista.setTelefone("(11) 98757-7859");
		diarista.setEndereco("Av Cajamar, N 111");
		diarista.setChavePix("123"); 
		
		
		System.out.println("Nome Diarista: " + diarista.getNome());
		System.out.println("Telefone Diarista: " + diarista.getTelefone());
		System.out.println("Endereço Diarista: " + diarista.getEndereco());
		System.out.println("Chave Pix Diarista: " + diarista.getChavePix());
		diarista.atender("Daniel");
		System.out.println("Saldo Cliente: " + diarista.getSaldo());
		diarista.depositar(30);
		System.out.println("Novo Saldo: " + diarista.getSaldo());
		diarista.sacar(10);
		System.out.println("Saque:" + diarista.getSaldo());
		
		
		System.out.println("===============================================================");
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Daniel");
		cliente.setTelefone( "(11) 98568-8974"); 
		cliente.setEndereco("Rua das Americas"); 
		
		
		System.out.println("Nome Cliente: " + cliente.getNome());
		System.out.println("Telefone Cliente: " + cliente.getTelefone());
		System.out.println("Endereço Cliente: " + cliente.getEndereco());
		System.out.println("Saldo Cliente: " + cliente.getSaldo());
		cliente.depositar(30);
		System.out.println("Novo Saldo: " + cliente.getSaldo());
		cliente.sacar(20);
		System.out.println("Saque: " + cliente.getSaldo());
		
		System.out.println("===============================================================");
		
		Atendimento atendimento = new Atendimento();
		
		atendimento.setHoras(13);
		System.out.println(atendimento.getHoras());
		
		
	}
	
	

}
