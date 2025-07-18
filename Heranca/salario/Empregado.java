public class Empregado {
	
	private double salarioFixo;
	
	public Empregado(double salarioFixo) {
		super();
		this.salarioFixo = salarioFixo;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}
	
	public double calcularBonus(Departamento departamento) {
		double salarioComBonus = 0;
		if (departamento.alcancouMeta()) salarioComBonus = this.salarioFixo * 0.1;
		return salarioComBonus;
	}
	
	public double calcularSalarioTotal(Departamento departamento) {
		return this.salarioFixo + this.calcularBonus(departamento);
	}

}
