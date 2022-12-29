package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutroWrappers {
	
	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		int valor = idadeRef.intValue(); //unboxing
		
		Double dRef = Double.valueOf(3.2); //o mesmo que Double dRef = 3.2 //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		Number numero = Integer.valueOf(29);
		Number nfloat = Float.valueOf(29.9f); //polimorfismo
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
	}

}
