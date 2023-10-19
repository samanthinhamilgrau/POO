package br.com.sesi.model;

public class Audio {
	
	protected String titulo;

	protected int duracao;
	
	protected int anoDeLancamento;
	
	protected double totalDeReproducoes;
	
	protected int curtidas;
	
	protected int classificacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public double getTotalDeReproducoes() {
		return totalDeReproducoes;
	}

	public void setTotalDeReproducoes(double totalDeReproducoes) {
		this.totalDeReproducoes = totalDeReproducoes;
	}
	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	
	public void imprimer() {
		
		System.out.println("Nome da musica: " + titulo);
		System.out.println("Ano lançamento: " + anoDeLancamento);
		System.out.println("Duração :" + duracao);

	}
	
	
	 public void curtir() {
	        curtidas++;
	        System.out.println(titulo + " foi curtido! Total de curtidas: " + curtidas);
	    }

	    public void reproduzir() {
	        totalDeReproducoes++;
	        System.out.println(titulo + " está sendo reproduzido. Total de reproduções: " + totalDeReproducoes);
	    }
}
