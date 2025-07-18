public class Teams implements CanalNotificacao{
	
	@Override
	public void notificarMensagem(Mensagem mensagem) {
		System.out.println("[TEAMS] {" + mensagem.getTipoMensagem().getDescricao() + "} - " + mensagem.getTexto());
	}

}
