public class Email implements CanalNotificacao{

	@Override
	public void notificarMensagem(Mensagem mensagem) {
		System.out.println("[EMAIL] {" + mensagem.getTipoMensagem().getDescricao() + "} - " + mensagem.getTexto());
	}

}
