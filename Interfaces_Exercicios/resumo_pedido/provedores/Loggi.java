package provedores;

public class Loggi implements ProvedorFrete{
	
	@Override
	public Frete calcularFrete(double peso, double valor) {
		double acrescimoFrete = peso > 5000 ? 1.12 : 1.04; 
		double valorFrete = valor * acrescimoFrete - valor;;
		
        return new Frete(valorFrete, obterTipoProvedorFrete());
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.LOGGI;

	}

}