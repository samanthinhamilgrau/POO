package br.com.sesi.model;

public class Podcast extends Audio {

	private String apresentador;

	public String getApresentador() {
		return apresentador;
	}

	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}
	
	@Override
	public void imprimer() {
		// TODO Auto-generated method stub
		super.imprimer();
		
		System.out.println("Apresentador: " + apresentador);
	}
}
