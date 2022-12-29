package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEnconding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "C";
		System.out.println(s.codePointAt(0)); //numero associado a tabela ASCII
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes();
		System.out.println(bytes.length + ", UTF-8");
		String sNovo = new String(bytes + ", UTF-8");
		System.out.println(sNovo);
		
		bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + ", windows-1252, ");
		sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + ", US_ASCII, ");
		sNovo = new String(bytes, "US_ASCII");
		System.out.println(sNovo);
	}
}
