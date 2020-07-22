package com.algaworks.estoque.repository;

import com.algaworks.estoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Long> {
}
