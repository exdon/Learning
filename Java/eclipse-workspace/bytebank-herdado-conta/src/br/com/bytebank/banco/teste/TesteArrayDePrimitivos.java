package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	//Array[]
	public static void main(String[] args) {
		int idade1 = 29;
		int idade2 = 39;
		int idade3 = 19;
		int idade4 = 69;
		int idade5 = 59;
		
		int[] idades = new int[5];
		
	for(int i = 0; i < idades.length; i++) {
		idades[i] = i * i;
	}	
	
	for(int i = 0; i < idades.length; i++) {
		System.out.println(idades[i]);
	}	
		
		

	}

}
