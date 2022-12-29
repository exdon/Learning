package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 21));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 21));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 56170);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> System.out.println(a));
		
		System.out.println("O aluno " + a1 + " está matriculado: ");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		//Vai dar true, porque reescrevi o método hashCode
		//Set, toda vez que criarmos um novo objeto (new) ele cria um especia de numero para esse obj
		// logo, um obj só será igual a ele mesmo, se ele tiver esse numero igual, ou seja
		// se o obj foi criado com o numero 1010, mesmo que eu crie um novo obj com os mesmos dados
		// como foi o caso do a1 e o turini, ele não será igual, pois esse novo obj foi criado com um outro numero
		// para ser igual, temos que comparar esse numero, pois isso foi reescrito o método hashCode, que seria esse numero
				
		
		System.out.println("O a1 é == ao Turini?");
		System.out.println(a1 == turini);
		//ele será false, pq == compara referencia do obj e toda vez que dou um new, eu crio um novo objeto.
		
		
		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
		//ele será false, pq equals compara referencia do obj e toda vez que dou um new, eu crio um novo objeto.
		//porém vai sair true, porque o método equals foi reescrito na classe Aluno.
		
		//A regra geral é:
		//Se eu tenho dois objetos que são equals,
		//obrigatoriamente o seguinte é true:
		
		System.out.println(a1.hashCode() == turini.hashCode());
		
		
		//iterator()
		
		//é algo mais antigo, do java 5, mas que alguas pessoas ainda usam
		//serve para iterar coisas, ou seja, em outras palavras adicionar
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		iterador.hasNext(); //tem um próximo elemento? retorna um boolean
		System.out.println("iterator " + iterador.hasNext());

		// enquanto iterador tiver um proximo elemento
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next(); //..retorne esse proximo
			System.out.println(proximo);
		}
		
	}

}
