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
		Calculadora calculadora = new Calculadora(2D, 3D, Operacao.SOMA);
		Assert.assertEquals(5D, calculadora.getResultadoOperacao(), 0.0);
	}

	@Test
	public void deveSubtrairDoisNumeros() {
		Calculadora calculadora = new Calculadora(2D, 3D, Operacao.SUBTRAI);
		Assert.assertEquals(-1D, calculadora.getResultadoOperacao(), 0.0);
	}

	@Test
	public void deveDividirDoisNumeros() {
		Calculadora calculadora = new Calculadora(6D, 3D, Operacao.DIVIDE);
		Assert.assertEquals(2D, calculadora.getResultadoOperacao(), 0.0);
	}

	@Test
	public void deveMultiplicarDoisNumeros() {
		Calculadora calculadora = new Calculadora(2D, 3D, Operacao.MULTIPLICA);
		Assert.assertEquals(6D, calculadora.getResultadoOperacao(), 0.0);
	}

}
