package br.com.db1.db1start.exercicios;

public class Exercicios {
	//1 - FUM que some dois números
	public int somarDoisNumeros(int numeroUm, int numeroDois) {
		return (numeroUm + numeroDois);
	}
	//2 - FUM que subtraia dois números
	public int subtrairDoisNumeros(int numeroUm, int numeroDois) {
		return (numeroUm - numeroDois);
	}
	//3 - FUM que multiplique dois números 
	public int multiplicaDoisNumeros(int numeroUm, int numeroDois) {
		return (numeroUm * numeroDois);
	}
	//4 - FUM que divida dois números
	public int divideDoisNumeros(int numeroUm, int numeroDois) {
		return (numeroUm / numeroDois);
	}
	//5 - FUM que diga se o número é par
	public int verificaNumeroPar(int numero){
		if(numero % 2 == 0)
		return 1;
		else
			return 0;
	}
	//6 - FUM que receba dois números e diga qual é o maior
	public int verificaQualEMaior (int numeroUm, int numeroDois) {
		if (numeroUm > numeroDois)
			return (numeroUm);
			else
				return(numeroDois);
	}
	//7 - FUM que a partir de um valor inicial, mostre os números de ímpares até 100. 
	public int numerosImparesAteCem (int numero) {
		int x, quantidade;
		quantidade = 0;
		for(x = numero; x < 100; x++) {
			if (x % 2 == 1) {
				quantidade++;
			}
		}
		return (quantidade);
		
	}
	
	//Strings
	//1 - FUM que receba um texto e devolva ele em LETRAS MAIUSCULAS
	public String devolverMaiuscula(String texto) {
		return texto.toUpperCase();
	}
	//2 - FUM que receba um texto e devolva ele em LETRAS MINUSCULAS
	public String devolverMinuscula(String texto) {
		return texto.toLowerCase();
	}
	//3 - FUM que receba DB1START e retorne a quantidade de letras que existe nesta palavra
	public int tamanhoTexto(String texto) {
		return texto.length();
	}
	//4 - FUM que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe
	public int tamanhoTextoComEspacamento(String texto) {
		String texto2 =  texto.trim();
		return texto2.length();
	}
	//5 - FUM que retorne o item 4 com a mesma quantidade de letras do item 3.
	public String retornarTextoSemEspacamento(String texto) {
		return texto.trim();
	}
	//6 - FUM que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
	public String primeirasQuatroLetras(String nome) {
		return nome.substring(0, 4);
	}
	//7 - FUM que receba o seu nome completo e exiba a partir da terceira letras do seu nome

	public String aPartirDaTerceiraLetra(String nome) {
		return nome.substring(3);
	}
	//8 - FUM que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
	public String UltimasQuatroLetrasDoNome(String nome) {
		return nome.substring(22);
	}
	//9 - FUM que receba o seu nome completo e substitua o seu  primeiro nome por ALUNO/ALUNA
	public String AlunoNoPrimeiroNome(String nome) {
		String nome2 = nome.replace("Gabriel","Aluno");
		return nome2;
	}
	//10 - FUM que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.
	//11 - FUM que receba um texto e exiba quantas vogais tem no texto
	public int ContarVogais(String texto) {
		int quantidade = 0;
		texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				quantidade++;
		}
		return quantidade;
	}
}
		
		
	


