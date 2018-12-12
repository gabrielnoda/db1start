package br.com.db1.db1start.calculadora.calculadoraapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.db1start.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1.db1start.calculadora.calculadoraapi.model.Operacao;
import br.com.db1.db1start.calculadora.calculadoraapi.service.CalculadoraService;

@RequestMapping("/api/calculadora")
@RestController
public class CalculadoraController {
	
	@Autowired
	private CalculadoraService calculadoraService;
	
	@GetMapping
	public Calculadora salvaNumero (@RequestParam("numeroUm") Double numeroUm, @RequestParam("numeroDois") Double numeroDois, @RequestParam("operacao") Operacao operacao) {
		Calculadora calculadora = calculadoraService.salvaOperacao(numeroUm, numeroDois, operacao);
		return calculadora;
	}

}
