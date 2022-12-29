package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clientecc1 = new Cliente();
		clientecc1.setNome("Nico");
		cc1.setTitular(clientecc1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clientecc2 = new Cliente();
		clientecc2.setNome("Guilherme");
		cc2.setTitular(clientecc2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clientecc3 = new Cliente();
		clientecc3.setNome("Paulo");
		cc3.setTitular(clientecc3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clientecc4 = new Cliente();
		clientecc4.setNome("Ana");
		cc4.setTitular(clientecc4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        for (Conta conta : lista) { //para cada conta em lista .. forEach
			System.out.println(conta);
		}
        
        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        
//        TitularDaContaComparator titularComparator = new TitularDaContaComparator();
//        lista.sort(titularComparator);
        
        //o mesmo que o de cima
        lista.sort(new TitularDaContaComparator());

        lista.sort(comparator);
        
        Collections.sort(lista, new TitularDaContaComparator());
        Collections.sort(lista); //a Classe Conta quem define a ordem de comparator *ver método compareTo
        lista.sort(null); // o mesmo que Collections.sort(lista)
        System.out.println("-----------");
        
        for (Conta conta : lista) { //para cada conta em lista .. forEach
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}

	}

}

class TitularDaContaComparator implements Comparator<Conta> {
	
	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomec1 = c1.getTitular().getNome();
		String nomec2 = c2.getTitular().getNome();
		
		return nomec1.compareTo(nomec2); //retorna o nome em ordem alphabetic, ou seja, o maior
	}
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		//forma melhor
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
		//forma um pouco melhor
//		return c1.getNumero() - c2.getNumero(); //irá retornar 1 ou -1
		
		
		//forma ruim
//		if(c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		
//		if(c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		
//		return 0;
	}
	
}
