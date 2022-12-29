package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		//Fluxo de Emtrada com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//cria um arquivo lorem2txt
		PrintStream ps = new PrintStream("lorem2.txt");
		
		PrintWriter pw = new PrintWriter("lorem2.txt", "UTF-8"); // UTF-8 é opcional
		
		ps.println("I am writing a new file"); //escreve no arquivo
		ps.println(); //new line
		ps.println("I am writing a new line in this file"); //escreve no arquivo
		
		pw.println("I am writing a new file"); //escreve no arquivo
		pw.println(); //new line
		pw.println("I am writing a new line in this file"); //escreve no arquivo
		
		ps.close(); //fecha o arquivo
		pw.close();

	}

}
