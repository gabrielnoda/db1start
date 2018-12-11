package br.com.db1.db1start.cidade.cidadeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.db1start.cidade.cidadeapi.model.Cidade;
import br.com.db1.db1start.cidade.cidadeapi.model.Uf;
import br.com.db1.db1start.cidade.cidadeapi.repository.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;

	public Cidade salvaCidade(String nome, Uf uf) {
		Cidade cidade = new Cidade(nome, uf);
		cidadeRepository.save(cidade);
		return cidade;
	}

}
