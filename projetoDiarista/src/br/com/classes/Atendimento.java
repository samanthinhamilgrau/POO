package br.com.classes;

public class Atendimento {
	
	private int horas;

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		
		if(horas >= 1 &&  horas <= 12) {
			
			this.horas = horas;
			System.out.println("PARABENS ATENDIMENTO REALIZADO");
			
		}else {
			
			
		}
		
		this.horas = horas;
		
		System.out.println("ATENTIMENTO FORA DO HORARIO COMERCIAL");
	}
	
	

}
