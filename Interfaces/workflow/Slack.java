public class Slack implements CanalNotificacao{

	@Override
	public void notificarMensagem(Mensagem mensagem) {
		System.out.println("[SLACK] {" + mensagem.getTipoMensagem().getDescricao() + "} - " + mensagem.getTexto());
	}
}
