public class Sms implements CanalNotificacao{

	@Override
	public void notificarMensagem(Mensagem mensagem) {
		System.out.println("[SMS] {" + mensagem.getTipoMensagem().getDescricao() + "} - " + mensagem.getTexto());		
	}

}
