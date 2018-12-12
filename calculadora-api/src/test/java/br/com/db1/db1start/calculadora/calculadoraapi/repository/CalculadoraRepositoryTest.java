package br.com.db1.db1start.calculadora.calculadoraapi.repository;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.db1.db1start.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1.db1start.calculadora.calculadoraapi.model.Operacao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadoraRepositoryTest {

	@Autowired
	private CalculadoraRepository calculadoraRepository;

	@Test
	public void deveSomarDoisNumeros() {
		Calculadora calculadora = new Calculadora(2, 3);
		Double resultadoSoma = calculadora.calcular(Operacao.SOMA);
		Assert.assertEquals(5, resultadoSoma, 0);
	}

}
