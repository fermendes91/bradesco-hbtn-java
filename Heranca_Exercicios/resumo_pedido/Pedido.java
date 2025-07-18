public class Pedido {
	
	private double percentualDesconto;
	private ItemPedido[] itensPedido;
	
	public Pedido(double percentualDesconto, ItemPedido[] itensPedido) {
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
		
		for (ItemPedido item : this.itensPedido) {
			double valorItem = item.getQuantidade() * item.getProduto().obterPrecoLiquido();
			valorCalculado += valorItem;
		}
				
		return valorCalculado;
	}
	
	public double calcularValorDesconto(double valorTotal) {
		double desconto = (this.percentualDesconto / 100);
		return valorTotal * desconto;
	}
	
    public void apresentarResumoPedido() {
        double valorTotalPedido = calcularTotal();
        double valorDesconto = calcularValorDesconto(valorTotalPedido);

        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item : this.itensPedido ) {
            System.out.println(String.format("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f", item.getProduto().getClass().getSimpleName(), item.getProduto().getTitulo(), item.getProduto().obterPrecoLiquido(), item.getQuantidade(), item.getQuantidade() * item.getProduto().obterPrecoLiquido()));
        }
        System.out.println("----------------------------");
        System.out.println(String.format("DESCONTO: %.2f", valorDesconto));
        System.out.println(String.format("TOTAL PRODUTOS: %.2f", valorTotalPedido));
        System.out.println("----------------------------");
        System.out.println(String.format("TOTAL PEDIDO: %.2f", valorTotalPedido - valorDesconto));
        System.out.println("----------------------------");
    }


}
