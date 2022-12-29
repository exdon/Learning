import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {


		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		//forma antiga
		Collections.sort(palavras);
		
		//forma nova
		palavras.sort(null);
		
		
		//forma antiga
		for (String p : palavras) {
			System.out.println(p);
		}
		
		//forma nova usando lambda
		palavras.forEach(p -> System.out.println(p));
		
		//---- Forma explicativa de como funciona o lambda por trás
//		Consumer<String> consumidor = new imprimeNaLinha();
		
		//---- O mesmo que acima, mas usando classe anonima
		Consumer<String> consumidor = new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				
			}
		};
		
		//--- mais resumido ainda que acima
		palavras.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				
			}
		});
		
		palavras.forEach(consumidor);
		
		//forma mais resumida ainda usando method reference
		//troque isso
		palavras.forEach(p -> System.out.println(p));
		//por isso
		palavras.forEach(System.out::println);
		
		
		// sort com lambda
		palavras.sort(Comparator.comparing(s -> s.length())); //palavras ordene comparando o tamanho da string
		
		// forma explicativa do que está acontecendo acima
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		// jeito mais resumido de fazer
		palavras.sort(Comparator.comparing(String::length)); //palavras ordene comparando o tamanho da string
		
		System.out.println(palavras);
	}

}

class imprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}

