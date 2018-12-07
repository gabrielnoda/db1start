package br.com.db1.db1start.exercicios;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
	@Test
	public void testar() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("fusca");
		Assert.assertEquals("fusca", pessoa.getNome());
	}
	
	@Test
	public void testarDataNascimento() {
		Pessoa pessoa = new Pessoa();
		pessoa.setDataNascimento("1997-09-23");
		Assert.assertEquals("1997-09-23", pessoa.getDataNascimento());
	}
}
