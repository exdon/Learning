package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Alura"; //object literal
		
		
		nome.replace("A", "a"); //não altera
		
		nome.toLowerCase(); // tbm não altera
		
		System.out.println(nome);
		
		// nome é imutavel, nasceu Alura e vai morrer Alura.
		// para alterar faça igual abaixo
		
		String outra = nome.replace("A", "a");
		String outraLower = nome.toLowerCase();
		
		char c = 'A'; //apenas um caracter *tem que estar entre aspas simples
		
		char b = nome.charAt(2); //retorna o caracter na posição informada
		int a = nome.indexOf("ur"); //posição onde começa essa string passada (ur)
		String sub = nome.substring(1); //retorna a string, começando pela posição indicada
		int length = nome.length();
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String vazio = "";
		System.out.println(vazio.isEmpty());
		
		String comEspacos = " Alura ";
		String retorno = comEspacos.trim(); //remove os espaços do inicio e fim.
		
		boolean contemDado = nome.contains("Alu"); //se contém aquele dado passado
		
		System.out.println(outra);
		System.out.println(outraLower);
		System.out.println(b);
		System.out.println(a);
		System.out.println(sub);
		System.out.println(length);
		System.out.println(retorno);
		System.out.println(contemDado);
		
		

	}

}
