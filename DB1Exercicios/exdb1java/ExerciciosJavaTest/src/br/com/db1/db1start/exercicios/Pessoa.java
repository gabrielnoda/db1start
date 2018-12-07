package br.com.db1.db1start.exercicios;

import java.util.Date;
import java.util.List;

public class Pessoa {

	private String nome;
	private Date dataNascimento;
	private Double peso;
	private List<Endereco> enderecos;

	public void setNome(String valor) {
		nome = valor;
	}

	public String getNome() {
		return nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}