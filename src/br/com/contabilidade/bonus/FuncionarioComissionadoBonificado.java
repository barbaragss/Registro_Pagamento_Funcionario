package br.com.contabilidade.bonus;

import br.com.contabilidade.funcionario.FuncionarioComissionado;

public class FuncionarioComissionadoBonificado extends FuncionarioComissionado{
	private double salarioBonus;
	
	public FuncionarioComissionadoBonificado (String primeiroNome, String ultimoNome, String cpf,
			double rendaBruta, double taxaComissao, double salarioBonus) {
		
		super(primeiroNome, ultimoNome, cpf, rendaBruta, taxaComissao);
		this.salarioBonus = salarioBonus;
	}
	public double getValorPagamentoBonificado() {
		return super.getValorPagamento() + this.getSalarioBonus();
	}

	public double getSalarioBonus() {
		return salarioBonus;
	}

	public void setSalarioBonus(double salarioBonus) {
		this.salarioBonus = salarioBonus;
	}

	@Override
	public String toString() {
		return "Nome: " + super.getPrimeiroNome() +" " + super.getUltimoNome() + 
				"\nCPF: " + super.getCpf() +
				"\nSalario Bruto: " + super.getRendaBruta() +
				"\nComissão: " + super.getTaxaComissao() +
				"\nSalario Total: " + super.getValorPagamento() +
				"\nBonificação: " + this.getSalarioBonus() +
				"\nSalario Bonificado: " + this.getValorPagamentoBonificado();
	}
	
	
}
