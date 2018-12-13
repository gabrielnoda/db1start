package br.com.db1.db1start.calculadora.calculadoraapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calculadora")
public class Calculadora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "numeroUm", nullable = false, length = 10)
	private Double numeroUm;

	@Column(name = "numeroDois", nullable = false, length = 10)
	private Double numeroDois;

	@Column(name = "dataOperacao", nullable = false, length = 30)
	private LocalDateTime dataOperacao;

	@Column(name = "resultadoOperacao", nullable = false, length = 10)
	private Double resultadoOperacao;

	@Column(name = "operacao", nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	private Operacao operacao;

	protected Calculadora() {

	}

	public Calculadora(Double numeroUm, Double numeroDois, Operacao operacao) {
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
		this.operacao = operacao;
		calcular();
		this.dataOperacao = LocalDateTime.now();
	}

	private void calcular() {
		resultadoOperacao = operacao.calcular(numeroUm, numeroDois);
	}

	public Long getId() {
		return id;
	}

	public Double getNumeroUm() {
		return numeroUm;
	}

	public Double getNumeroDois() {
		return numeroDois;
	}

	public Double getResultadoOperacao() {
		return resultadoOperacao;
	}

	public Operacao getOperacao() {
		return operacao;
	}

	public LocalDateTime getDataOperacao() {
		return dataOperacao;
	}
}
