package br.com.db1.db1start.exercicios;

public class Exercicios {
	// 1 - FUM que some dois números
	public int somarDoisNumeros(int numeroUm, int numeroDois) {
		return (numeroUm + numeroDois);
	}

	// 2 - FUM que subtraia dois números
	public int subtrairDoisNumeros(int numeroUm, int numeroDois) {
		return (numeroUm - numeroDois);
	}

	// 3 - FUM que multiplique dois números
	public int multiplicaDoisNumeros(int numeroUm, int numeroDois) {
		return (numeroUm * numeroDois);
	}

	// 4 - FUM que divida dois números
	public int divideDoisNumeros(int numeroUm, int numeroDois) {
		return (numeroUm / numeroDois);
	}

	// 5 - FUM que diga se o número é par
	public Boolean verificaNumeroPar(int numero) {
		if (numero % 2 == 0)
			return true;
		else
			return false;
	}

	// 6 - FUM que receba dois números e diga qual é o maior
	public int verificaQualEMaior(int numeroUm, int numeroDois) {
		if (numeroUm > numeroDois)
			return (numeroUm);
		else
			return (numeroDois);
	}

	// 7 - FUM que a partir de um valor inicial, mostre os números de ímpares até
	// 100.
	public int numerosImparesAteCem(int numero) {
		int quantidade = 0;
		for (int x = numero; x <= 100; x++) {
			if (x % 2 == 1) {
				quantidade++;
			}
		}
		return quantidade;

	}

	// Strings
	// 1 - FUM que receba um texto e devolva ele em LETRAS MAIUSCULAS
	public String devolverMaiuscula(String texto) {
		return texto.toUpperCase();
	}

	// 2 - FUM que receba um texto e devolva ele em LETRAS MINUSCULAS
	public String devolverMinuscula(String texto) {
		return texto.toLowerCase();
	}

	// 3 - FUM que receba DB1START e retorne a quantidade de letras que existe nesta
	// palavra
	public int tamanhoTexto(String texto) {
		return texto.length();
	}

	// 4 - FUM que receba DB1START (tendo um espaço no inicio e no fim da palavra) e
	// retorne a quantidade de letras que existe
	public int tamanhoTextoComEspacamento(String texto) {
		String texto2 = texto.trim();
		return texto2.length();
	}

	// 5 - FUM que retorne o item 4 com a mesma quantidade de letras do item 3.
	public String retornarTextoSemEspacamento(String texto) {
		return texto.trim();
	}

	// 6 - FUM que receba o seu nome completo e exiba somente as 4 primeiras letras
	// do seu nome
	public String primeirasQuatroLetras(String nome) {
		return nome.substring(0, 4);
	}
	// 7 - FUM que receba o seu nome completo e exiba a partir da terceira letras do
	// seu nome

	public String aPartirDaTerceiraLetra(String nome) {
		return nome.substring(3);
	}

	// 8 - FUM que receba o seu nome completo e exiba somente as 4 ultimas letras do
	// seu nome
	public String ultimasQuatroLetrasDoNome(String nome) {
		int tamanhoNome = nome.length();
		return nome.substring(tamanhoNome - 4);
	}

	// 9 - FUM que receba o seu nome completo e substitua o seu primeiro nome por
	// ALUNO/ALUNA
	public String alunoNoPrimeiroNome(String nome) {
		String primeiroNome = "";
		for (int i = 0; i < nome.length(); i++) {
			char c = nome.charAt(i);
			if (c == ' ')
				i = 100;
			else
				primeiroNome += nome.charAt(i);
		}
		return nome.replace(primeiroNome, "Aluno");

	}

	// 10 - FUM que receba o seguinte texto "banana, maçã, melancia" e exiba o texto
	// separadamente.
	public String separarTexto(String texto) {
		return texto.replace(",", "");
	}

	// 11 - FUM que receba um texto e exiba quantas vogais tem no texto
	public int contarVogais(String texto) {
		int quantidade = 0;
		String txt2 = texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = txt2.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				quantidade++;
		}
		return quantidade;
	}

	// 12 - FUM que receba um texto e devolva ele invertido
	public String textoInvertido(String texto) {
		String invertida = new StringBuilder(texto).reverse().toString();
		return invertida;
	}

	// Double
	// 1 - FUM que exiba qual é o menor valor entre dois doubles
	public Double menorValorDouble(Double valorUm, Double valorDois) {
		if (valorUm < valorDois)
			return valorUm;
		else
			return valorDois;
	}

	// 2 - FUM que exiba qual é o menor valor entre três doubles
	public Double menorValoEntreTresDouble(Double valorUm, Double valorDois, Double valorTres) {
		if (valorUm < valorDois && valorUm < valorTres)
			return valorUm;
		if (valorDois < valorUm && valorDois < valorTres)
			return valorDois;
		else
			return valorTres;
	}

	// 3 - FUM que exiba a média de três números
	public Double tirarMedia(Double valorUm, Double valorDois, Double valorTres) {
		return (valorUm + valorDois + valorTres) / 3;
	}

	// 4 - FUM que calcule a área de um triangulo
	public Double areaTriangulo(Double altura, Double base) {
		return (altura * base) / 2;
	}
}
