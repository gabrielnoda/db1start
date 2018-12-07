package br.com.db1.db1start.exercicios;

import br.com.db1.db1start.composicao.Bacon;
import br.com.db1.db1start.composicao.Feijao;
import br.com.db1.db1start.composicao.Feijoada;

public class Test {
	public void test() {
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		Recibo recibo = new Recibo();
		Feijoada feijoada = 
				new Feijoada(new Feijao(), new Bacon());
	}

}
