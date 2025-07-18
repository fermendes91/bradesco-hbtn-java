package provedores;

public class Sedex implements ProvedorFrete{

	@Override
	public Frete calcularFrete(double peso, double valor) {
		double acrescimoFrete = peso > 1000 ? 1.1 : 1.05;
		double valorFrete = valor * acrescimoFrete - valor;
	
        return new Frete(valorFrete, obterTipoProvedorFrete());
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.SEDEX;

	}

}
