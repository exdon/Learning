package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>(); //Set conjuntos
		
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Mauricio Aniche");
		
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos.size());
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		
		// diferenças entre List e Set
		// em List existe uma ordem dos elementos, já em Set não, eles podem estar inseridos em qualquer ordem aleatória.
		
		//Vantagens do Set
		// ele não aceita elementos repetidos
		// ele faz uma busca por elementos de uma forma bem mais rápida que um linkedlist por exmeplo
		
		//Se eu quiser converter um Set em List
		List<String> alunosEmLista = new ArrayList<>(alunos);

	}

}

class TestaPerformance {

    public static void main(String[] args) {
//descomente um ou outro para testar o tempo gasto
    	
    	
//        Collection<Integer> numeros = new ArrayList<Integer>();
//        Collection<Integer> numeros = new LinkedList<Integer>();
        Collection<Integer> numeros = new HashSet<Integer>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }

}
