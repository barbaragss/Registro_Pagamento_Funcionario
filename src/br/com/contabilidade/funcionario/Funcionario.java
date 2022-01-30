package br.com.contabilidade.funcionario;

import br.com.contabilidade.pagamentointerface.Pagavel;

public abstract class Funcionario implements Pagavel{
	private String primeiroNome;
	private String ultimoNome;
	private String cpf;
	
	public Funcionario(String primeiroNome, String ultimoNome, String cpf) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.cpf = cpf;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Funcionario [primeiroNome=" + primeiroNome + ", ultimoNome=" + ultimoNome + ", cpf=" + cpf + "]";
	}
	
}
