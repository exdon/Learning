package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Cliente cliente = new Cliente();
		cliente.setNome("Nico");
		cliente.setProfissao("Dev");
		cliente.setCpf("23112387955");
//
		String nome = "Nico Steppat";
		
		//Escrita
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
		//Leitura
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente2  = (Cliente) ois.readObject();
//		String nome2  = (String) ois.readObject();
		ois.close();
		System.out.println(cliente2.getNome());
		

	}

}
