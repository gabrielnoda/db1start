package br.com.db1.db1start.calculadora.calculadoraapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.db1start.calculadora.calculadoraapi.dto.CalculadoraDTO;
import br.com.db1.db1start.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1.db1start.calculadora.calculadoraapi.service.CalculadoraService;

@RequestMapping("/api/calculadora")
@RestController
public class CalculadoraController {

	@Autowired
	private CalculadoraService calculadoraService;

	@PostMapping
	public Calculadora post(@RequestBody CalculadoraDTO calculo) {
		return calculadoraService.salvaOperacao(calculo.getNumeroUm(), calculo.getNumeroDois(), calculo.getOperacao());
	}

	@GetMapping
	public List<Calculadora> todosCalculos() {
		return calculadoraService.buscarTodosCalculos();
	}
}
