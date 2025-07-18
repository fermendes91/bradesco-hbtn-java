public class Pedido {
	
	private double percentualDesconto;
	private ItemPedido[] itensPedido;
	
	public Pedido(double percentualDesconto, ItemPedido[] itensPedido) {
		super();
		this.percentualDesconto = percentualDesconto;
		this.itensPedido = itensPedido;
	}
	
	public double getPercentualDesconto() {
		return percentualDesconto;
	}
	public void setPercentualDesconto(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}
	
	public ItemPedido[] getItensPedido() {
		return itensPedido;
	}
	public void setItensPedido(ItemPedido[] itensPedido) {
		this.itensPedido = itensPedido;
	}
	
	public double calcularTotal() {
		double valorCalculado = 0;
		double desconto = (this.percentualDesconto / 100);
		
		for (ItemPedido item : this.itensPedido) {
			double valorItem = item.getQuantidade() * item.getProduto().obterPrecoLiquido();
			valorCalculado += valorItem;
		}
				
		double valorDesconto = valorCalculado * desconto;
		return valorCalculado - valorDesconto;
	}
	
	

}
