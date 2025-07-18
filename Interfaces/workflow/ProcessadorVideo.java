import java.util.ArrayList;

public class ProcessadorVideo {
	
	private ArrayList<CanalNotificacao> canais = new ArrayList<>();

	public void registrarCanal(CanalNotificacao canal) {
		this.canais.add(canal);
	}
	
	public void processar(Video video) {
		for (CanalNotificacao canal : this.canais) {
			Mensagem mensagem = new Mensagem();
			mensagem.setTipoMensagem(TipoMensagem.LOG);
			mensagem.setTexto(video.getArquivo() + " - " + video.getFormato().getDescricao());
			canal.notificarMensagem(mensagem);
		}
	}
}
