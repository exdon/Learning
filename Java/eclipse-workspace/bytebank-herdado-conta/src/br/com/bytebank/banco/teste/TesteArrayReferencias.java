package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		Conta[] contas = new Conta[5];
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 33);
		contas[1] = cc2;
		
		Conta ref = contas[1];
		ContaPoupanca refp = (ContaPoupanca) contas[1];
		
		System.out.println(contas[1].getNumero());

	}

}
