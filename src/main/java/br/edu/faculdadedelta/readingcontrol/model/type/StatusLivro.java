package br.edu.faculdadedelta.readingcontrol.model.type;

public enum StatusLivro {
	
	LENDO("Lendo"), 
	LIDO("Lido"), 
	QUERO_LER("Quero ler"),
	ABANDONADO("Abandonei"),
	RELENDO("Relendo");
	
	private String descricao;

	private StatusLivro(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
