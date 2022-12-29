package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
//		//Fluxo de Emtrada com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//forma 1
		FileWriter fw = new FileWriter("lorem2.txt");
		fw.write("I am writing a new file");
		fw.write(System.lineSeparator()); // new line \n
		fw.write("I am writing a new line in this file");
		
		//forma2
		FileWriter fw2 = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw2); 
		// pode fazer igual abaixo tbm para reduzir mais: 
		// BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt")); 
		bw.newLine();
		bw.write("I am writing a new line in this file");
		
		
		bw.close();

	}

}
