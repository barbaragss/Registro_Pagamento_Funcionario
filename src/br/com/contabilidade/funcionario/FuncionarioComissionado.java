package br.com.contabilidade.funcionario;

public class FuncionarioComissionado extends Funcionario{
	private double rendaBruta;
	private double taxaComissao;
	
	public FuncionarioComissionado (String primeiroNome, String ultimoNome, String cpf,
			double rendaBruta, double taxaComissao) {
		super(primeiroNome, ultimoNome, cpf);
		this.rendaBruta = rendaBruta;
		this.taxaComissao = taxaComissao;
	}
	
	@Override
	public double getValorPagamento() {
		double comissao;
		comissao = this.getRendaBruta() * (this.getTaxaComissao() / 100);
		return this.getRendaBruta() + comissao;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}

	@Override
	public String toString() {
		return "Nome: " + super.getPrimeiroNome() +" " + super.getUltimoNome() + 
				"\nCPF: " + super.getCpf() +
				"\nSalario Bruto: " + this.getRendaBruta() +
				"\nComissão: " + this.getTaxaComissao() +
				"\nSalario Total: " + this.getValorPagamento();
	}
	
}
