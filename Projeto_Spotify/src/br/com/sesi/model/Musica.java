package br.com.sesi.model;

public class Musica extends Audio {

	private String cantor;

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}
	
	 @Override
	public void imprimer() {
		// TODO Auto-generated method stub
		super.imprimer();
		
		System.out.println("Cantor: " + cantor);
	}
	
	
}
