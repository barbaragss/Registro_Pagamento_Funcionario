package br.com.contabilidade.funcionario;

public class FuncionarioHorista extends Funcionario {
	private double salario;
	private double hora;
	
	public FuncionarioHorista (String primeiroNome, String ultimoNome, String cpf, 
			double salario, double hora) {
		
		super(primeiroNome, ultimoNome, cpf);
		this.salario = salario;
		this.hora = hora;
	}
	
	@Override
	public double getValorPagamento() {
		double salario = this.getHora() * this.getSalario();
		return salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Nome: " + super.getPrimeiroNome() +" " + super.getUltimoNome() + 
				"\nCPF: " + super.getCpf() +
				"\nHoras Trabalhadas: " + this.getHora() +
				"\nValor da Hora: " + this.getSalario() +
				"\nSalario Total: " + this.getValorPagamento();
	}
}
