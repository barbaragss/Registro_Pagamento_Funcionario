package br.com.contabilidade.funcionario;

public class FuncionarioAssalariado extends Funcionario {
	private double salarioSemanal;

	public FuncionarioAssalariado(String primeiroNome, String ultimoNome, String cpf, 
			double salarioSemanal) {
		
		super(primeiroNome, ultimoNome, cpf);
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public double getValorPagamento() {
		
		return this.getSalarioSemanal() * 4;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public String toString() {
		return "Nome: " + super.getPrimeiroNome() +" " + super.getUltimoNome() + 
				"\nCPF: " + super.getCpf() +
				"\nSalario Semanal: " + this.getSalarioSemanal() +
				"\nSalario Mensal: " + this.getValorPagamento();
	}
	
}
