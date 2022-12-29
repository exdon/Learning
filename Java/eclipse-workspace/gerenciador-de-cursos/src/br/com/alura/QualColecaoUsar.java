package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class QualColecaoUsar {

	public static void main(String[] args) {


		Collection<Aluno> alunos = new HashSet<>();
		alunos.size();
		//alunos.get(0); //não funciona para HashSet, pois não existe indices em HashSet
		
		/*
		 * Quando a ordem dos elementos não importa?
		 * usamos Set
		 * 
		 * Quando a ordem é algo importante?
		 * usamos List
		 * 
		 * Qual tem melhor performance?
		 * Set
		 * mas é importante lembrar, que não possuem ordem e se ela importar,
		 * mesmo não tendo a melhor performance, devemos usar List
		 * 
		 * posso ter elementos repetidos, qual usar?
		 * List
		 * 
		 * Não posso ter elementos repetidos, qual usar?
		 * Set
		 * 
		 * 
		 * Não sei qual usar, e agora?
		 * declare como Collection que engloba tanto Set como List
		 * e ai essa definição fica na instancia do objeto, quando demos o new 
		 * 
		 * */

	}

}
