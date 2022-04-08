package com.generation.mundogamer.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.mundogamer.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

	public List<Produtos> findAllByNomeContainingIgnoreCase(String nome);
	
	public List<Produtos> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	public List<Produtos> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
	
}