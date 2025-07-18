import exceptions.*;

public class ContaBancariaBasica {
	
	private String numeracao;
	private double saldo;
	private double taxaJurosAnual;
	
	public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
		this.saldo = 0;
		this.numeracao = numeracao;
		this.taxaJurosAnual = taxaJurosAnual;
	}

	public String getNumeracao() {
		return numeracao;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getTaxaJurosAnual() {
		return taxaJurosAnual;
	}
	
	public void depositar(double valor) throws OperacaoInvalidaException {
		if (valor <= 0) throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
		this.saldo += valor;
	}
	
	public void sacar(double valor) throws OperacaoInvalidaException {
		if (valor <= 0) throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
		if (this.saldo < valor) throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
		this.saldo -= valor;
	}
	
    public double calcularTarifaMensal() {
        return (getSaldo() * 0.1 > 10.0 ? 10.0 : getSaldo() * 0.1);
    }

    public double calcularJurosMensal() {
        return (getSaldo() < 0.0 ? 0.0 : (getSaldo() * (getTaxaJurosAnual() / 1200.0)));
    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = getSaldo() - calcularTarifaMensal() + calcularJurosMensal();
    }
	
}
