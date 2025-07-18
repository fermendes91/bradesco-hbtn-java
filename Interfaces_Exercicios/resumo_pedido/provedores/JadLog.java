package provedores;

public class JadLog implements ProvedorFrete{
	
	@Override
	public Frete calcularFrete(double peso, double valor) {
		double acrescimoFrete = peso > 2000 ? 1.07 : 1.045; 
		double valorFrete = valor * acrescimoFrete - valor;
		
        return new Frete(valorFrete, obterTipoProvedorFrete());
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.JADLOG;
	}

}
