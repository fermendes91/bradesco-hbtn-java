public enum FormatoVideo {
	
	MPEG("MPEG"),
	AVI("AVI"),
	WMV("WMV"),
	MP4("MP4"),
	MKV("MKV");
	
	private String descricao;
	
	FormatoVideo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
