package main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;
import main.java.br.com.alura.tdd.modelo.Funcionario;
import java.math.RoundingMode;


public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionário com salario maior do que R$ 10.000 não pode receber bonus!");
		}
		return valor.setScale(2, RoundingMode.HALF_UP); //com duas casas decimais, arredondando numero pra cima se for quebrado
	}

}
