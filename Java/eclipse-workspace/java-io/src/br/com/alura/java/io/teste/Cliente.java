package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 * @author Erik Exdon
 * @version 0.1
 * 
 */
public class Cliente implements Serializable {

	// O serialVersionUID define a versão atual da classe e esse valor fica gravado na representação binária do objeto.
	// Cada vez que alteramos algo incompatível na classe (ex. mudar de String pra int um atributo), devemos alterar o seu valor (1L vira 2L por exemplo). 
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
