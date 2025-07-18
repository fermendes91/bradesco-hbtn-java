public class Gerente extends Empregado{
	
	public Gerente(double salarioFixo) {
		super(salarioFixo);
	}

	@Override
	public double calcularBonus(Departamento departamento) {
		if (departamento.alcancouMeta()) {
			double salarioComBonus = this.getSalarioFixo() * 0.2;
			double bonusAdicional = (departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01;
			
			return salarioComBonus + bonusAdicional;
		}
		
		return 0;
	}

}
