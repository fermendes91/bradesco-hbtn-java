package provedores;

public enum TipoProvedorFrete {
	
	SEDEX("SEDEX"),
	JADLOG("JADLOG"),
	LOGGI("LOGGI");
	
	private String descricao;

	TipoProvedorFrete(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
