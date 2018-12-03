package br.com.db1.db1start.exercicios;

import org.junit.Assert;
import org.junit.Test;

public class exerciciosTeste {
	//1 - FUM que some dois n�meros
	
	@Test
	public void deveSomarDoisNumeros() {
	Exercicios exercicio = new Exercicios();
	int Soma = exercicio.somarDoisNumeros(5, 4);
	Assert.assertEquals(9,Soma);
	}
	 //2 - FUM que subtraia dois n�meros
	@Test
	public void deveSubtrairDoisNumeros() {
	Exercicios exercicio = new Exercicios();
	int subtrair = exercicio.subtrairDoisNumeros(5, 4);
	Assert.assertEquals(1,subtrair);
	}
	//3 - FUM que multiplique dois n�meros 
	@Test
	public void deveMultiplicarDoisNumeros() {
	Exercicios exercicio = new Exercicios();
	int resultadoMultiplicacao = exercicio.multiplicaDoisNumeros(5, 4);
	Assert.assertEquals(20,resultadoMultiplicacao);
	}
	//4 - FUM que divida dois n�meros
	@Test
	public void deveDividirDoisNumeros() {
	Exercicios exercicio = new Exercicios();
	int resultadoDivisao = exercicio.divideDoisNumeros(6, 2);
	Assert.assertEquals(3,resultadoDivisao);
	}
	//5 - FUM que diga se o n�mero � par
	@Test
	public void deveVerificarNumeroPar() {
	Exercicios exercicio = new Exercicios();
	int verificaPar = exercicio.verificaNumeroPar(6);
	Assert.assertEquals(1, verificaPar);
	}
	//6 - FUM que receba dois n�meros e diga qual � o maior
	@Test
	public void deveRetornarMaiorNumero() {
	Exercicios exercicio = new Exercicios();
	int maiorNumero = exercicio.verificaQualEMaior(5,9);
	Assert.assertEquals(9, maiorNumero);
	}
	//7 - FUM que a partir de um valor inicial, mostre os n�meros de �mpares at� 100. 
	@Test
	public void deveMostrarNumerosImparesAteCem() {
	Exercicios exercicio = new Exercicios();
	int numerosImpar = exercicio.numerosImparesAteCem(90);
	Assert.assertEquals(5, numerosImpar);
	}
	
	//Strings
	//1 - FUM que receba um texto e devolva ele em LETRAS MAIUSCULAS
	@Test
	public void deveDeixarTextoMaiusculo() {
	Exercicios exercicio = new Exercicios();
	String maiusculo = exercicio.devolverMaiuscula("texto maiusculo");
	Assert.assertEquals("TEXTO MAIUSCULO", maiusculo);
	}
	//2 - FUM que receba um texto e devolva ele em LETRAS MINUSCULAS
	@Test
	public void deveDeixarTextoMinusculo() {
	Exercicios exercicio = new Exercicios();
	String minuscula = exercicio.devolverMinuscula("TEXTO MINUSCULA");
	Assert.assertEquals("texto minuscula", minuscula);
	}
	//3 - FUM que receba DB1START e retorne a quantidade de letras que existe nesta palavra
	@Test
	public void deveDevolverQuantidadeDeLetras() {
	Exercicios exercicio = new Exercicios();
	int quantidaDeLetras = exercicio.tamanhoTexto("DB1START");
	Assert.assertEquals(8, quantidaDeLetras);
	}
	//4 - FUM que receba DB1START (tendo um espa�o no inicio e no fim da palavra) e retorne a quantidade de letras que existe 
	@Test
	public void deveDevolverQuantidadeDeLetrasComEspacamento() {
	Exercicios exercicio = new Exercicios();
	int quantidaDeLetrasEspaco = exercicio.tamanhoTextoComEspacamento(" DB1START ");
	Assert.assertEquals(8, quantidaDeLetrasEspaco);
	}
	//5 - FUM que retorne o item 4 com a mesma quantidade de letras do item 3.
	@Test
	public void deveDevolverTextoSemEspacamento() {
	Exercicios exercicio = new Exercicios();
	String textoSemEspacamento = exercicio.retornarTextoSemEspacamento (" DB1START ");
	Assert.assertEquals("DB1START", textoSemEspacamento);
	}
	//6 - FUM que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
	@Test
	public void deveRetornarPrimeirasQuatroLetras() {
	Exercicios exercicio = new Exercicios();
	String primeirasQuatroLetras = exercicio.primeirasQuatroLetras("Gabriel Eid Umbelino Noda");
	Assert.assertEquals("Gabr", primeirasQuatroLetras);
	}
	//7 - FUM que receba o seu nome completo e exiba a partir da terceira letras do seu nome
	@Test
	public void deveRetornarNomeApos3Letra() {
	Exercicios exercicio = new Exercicios();
	String textoDepoisDa3 = exercicio.aPartirDaTerceiraLetra("Gabriel Eidi Umbelino Noda");
	Assert.assertEquals("riel Eidi Umbelino Noda", textoDepoisDa3);
	}
	//8 - FUM que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
	@Test
	public void deveRetornarUltimas4Letras() {
	Exercicios exercicio = new Exercicios();
	String Ultimas4 = exercicio.UltimasQuatroLetrasDoNome("Gabriel Eidi Umbelino Noda");
	Assert.assertEquals("Noda", Ultimas4);
	}
	//9 - FUM que receba o seu nome completo e substitua o seu  primeiro nome por ALUNO/ALUNA
	@Test
	public void devePrimeiroNomeSubstituidoPorAluno() {
	Exercicios exercicio = new Exercicios();
	String Aluno = exercicio.AlunoNoPrimeiroNome("Gabriel Eidi Umbelino Noda");
	Assert.assertEquals("Aluno Eidi Umbelino Noda", Aluno);
	}
	//10 - FUM que receba o seguinte texto "banana, ma��, melancia" e exiba o texto separadamente.
	//11 - FUM que receba um texto e exiba quantas vogais tem no texto
	@Test
	public void deveContarVogais() {
	Exercicios exercicio = new Exercicios();
	int vogais = exercicio.ContarVogais("Gabriel Eidi Umbelino Noda");
	System.out.println(vogais);
	Assert.assertEquals(11 , vogais);
	}
}


