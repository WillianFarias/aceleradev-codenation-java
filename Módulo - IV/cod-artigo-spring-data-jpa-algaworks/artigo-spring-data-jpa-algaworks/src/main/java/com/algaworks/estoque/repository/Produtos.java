package com.algaworks.estoque.repository;

import com.algaworks.estoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

//Responsavel pelo CRUD
public interface Produtos extends JpaRepository<Produto, Long> {

}
