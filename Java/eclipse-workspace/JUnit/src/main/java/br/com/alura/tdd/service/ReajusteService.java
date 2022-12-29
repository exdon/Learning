package main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;
import main.java.br.com.alura.tdd.modelo.Funcionario;

import main.java.br.com.alura.tdd.modelo.Desempenho;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
//			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajuste = funcionario.getSalario().multiply(desempenho.percentualReajuste());
			funcionario.reajustarSalario(reajuste);
	}

}
