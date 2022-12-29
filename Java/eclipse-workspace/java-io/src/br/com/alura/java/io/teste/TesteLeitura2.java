package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(";");
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			// new Locale("pt", "BR") para definir os valores com ',' ou inves de '.' (10.50 fica 10,50)
			// '%' para pegar o valor e 
			// 's' dizendo que é do tipo String
			// 'd' dizendo que é do tipo decimal int
			// 'f' dizendo que é do tipo float
			// '04' dizendo que terá 4 caracteres, com zeros caso não tenha 4 ex: 22 = (0022), 2222 = (2222)
			// '08' a mesma coisa que acima, mas com 8 caracteres
			// '08.2' a mesma coisa, porém agora com 2 casas decimais após o ponto/virugula
			String valorFormatado = String.format(new Locale("pt", "BR"),"%s - %04d-%08d, %s: %08.2f", valor1, valor2, valor3, valor4, valor5);
			
			System.out.println("valor formatado " + valorFormatado);
			// outra forma de fazer abaixo:
			System.out.format(new Locale("pt", "BR"),"%s - %04d-%08d, %s: %08.2f", valor1, valor2, valor3, valor4, valor5);
			
			/**
			 * Documentação:
			 * https://www.javatpoint.com/java-string-format
			 * 
			 */
			
			
			linhaScanner.close();
			
//			String[] valores = linha.split(";");
//			System.out.println(valores[3]);
			
		}
		
		scanner.close();
	}
}
