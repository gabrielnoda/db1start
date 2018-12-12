package br.com.db1.db1start.calculadora.calculadoraapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.db1.db1start.calculadora.calculadoraapi.model.Calculadora;

public interface CalculadoraRepository extends JpaRepository<Calculadora, Long>{

}
