package br.com.db1.db1start.calculadora.calculadoraapi.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.db1start.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1.db1start.calculadora.calculadoraapi.model.Operacao;
import br.com.db1.db1start.calculadora.calculadoraapi.repository.CalculadoraRepository;

@Service
public class CalculadoraService {
	
	@Autowired
	private CalculadoraRepository calculadoraRepository;
	
	public Calculadora salvaOperacao(Double numeroUm, Double numeroDois, Operacao operacao) {
		Calculadora calculadora = new Calculadora(numeroUm, numeroDois, operacao);
		return calculadoraRepository.save(calculadora);
	}

	public List<Calculadora> buscarTodosCalculos(){
		return calculadoraRepository.findAll();
	}
 }
