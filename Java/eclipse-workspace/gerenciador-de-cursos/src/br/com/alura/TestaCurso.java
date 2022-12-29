package br.com.alura;

import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		//aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 21));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 21));
		
		System.out.println(aulasImutaveis);

//		Collections.sort(aulasImutaveis);
		
		

	}

}
