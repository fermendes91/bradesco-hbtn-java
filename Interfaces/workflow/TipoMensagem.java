public enum TipoMensagem {
	
	AVISO("AVISO"),
	ERRO("ERRO"),
	LOG("LOG");
	
	private String descricao;
	
	TipoMensagem(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
