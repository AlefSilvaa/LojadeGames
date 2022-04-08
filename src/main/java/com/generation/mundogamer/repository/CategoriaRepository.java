package com.generation.mundogamer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.mundogamer.model.Categorias;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categorias, Long>{
     public List<Categorias> findAllByTipoContainingIgnoreCase(String Tipo);
}
