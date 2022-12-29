import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAlunos() {
		return alunos;
	}
}


public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		//----- Ordenar cursos
		// usando lambda
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		// usando method references
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		// imprimindo
		cursos.forEach(c -> System.out.println(c.getNome()));
		
		
		//---- Imprimit todos os cursos que tem mais de 100 alunos
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.forEach(c -> System.out.println(c.getNome()));
		
		// --- Ver quantos alunos tem cada um desses cursos
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(c -> c.getAlunos())
			.forEach(total -> System.out.println(total));
		// Fazendo o mesmo que acima, mas usando method reference
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		
		//--- Usando as variaveis do método map()
		//--- mapToInt
		int soma = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.mapToInt(Curso::getAlunos)
			.sum();
		// Somando todos os alunos
		
		System.out.println("resultado da soma: " + soma);
		
		//--- Usando os métodos de filter()
		Optional<Curso> optionalCurso = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny();
		Curso curso = optionalCurso.orElse(null);
		System.out.println(curso.getNome());
		
		
		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
		// Normalmente se usa mais assim, concatenando:
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));
		// ifPresente - Ele diz, se esse curso existir, me retorne o nome dele, se não, ele retorna nada
		
		/* 
		 * O Optional é uma classe que entrou a partir do java 8, 
		 * que permite que trabalhemos com referencias, 
		 * sem necessidade de ficar fazendo verificações de valores nulos, 
		 * ou seja, colocar vários “if (something == null)”.
		 * 
		 * */
			
		OptionalDouble media = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos)
				.average();
		System.out.println("media: " + media);
		
		List<Curso> resultado = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toList());
		
		cursos = resultado;
		cursos.stream().forEach(c -> System.out.println(c.getNome()));
		
		//--- Usando Map
		
		Map<String, Integer> mapCursos = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		
		System.out.println(mapCursos);
		
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
			.forEach((nome, alunos) -> System.out.println("O curso " + nome + " tem " + alunos + " alunos"));
		
	}

}
