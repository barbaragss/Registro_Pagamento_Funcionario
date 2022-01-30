package br.com.contabilidade.main;

import java.util.ArrayList;

import br.com.contabilidade.bonus.FuncionarioComissionadoBonificado;
import br.com.contabilidade.funcionario.Funcionario;
import br.com.contabilidade.funcionario.FuncionarioAssalariado;
import br.com.contabilidade.funcionario.FuncionarioComissionado;
import br.com.contabilidade.funcionario.FuncionarioHorista;

public class Contabilidade {

	public static void main(String[] args) {

		FuncionarioComissionadoBonificado barbara = new FuncionarioComissionadoBonificado("Bárbara", "Sousa",
				"987654321",1000, 10, 200);
		
		FuncionarioAssalariado ismael = new FuncionarioAssalariado ("Ismael", "Melo","123456789", 300);
		
		FuncionarioComissionado bia = new FuncionarioComissionado ("Beatriz", "Sousa", "147258369", 550, 1);
		
		FuncionarioHorista jeff = new FuncionarioHorista ("Jefferson", "Silva", "369258147", 14, 150);
		
		ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		
		listaFuncionario.add(barbara);
		listaFuncionario.add(ismael);
		listaFuncionario.add(bia);
		listaFuncionario.add(jeff);
		
		for (Funcionario funcionario : listaFuncionario) {
			System.out.println(funcionario + "\n");
		}
	}

}
