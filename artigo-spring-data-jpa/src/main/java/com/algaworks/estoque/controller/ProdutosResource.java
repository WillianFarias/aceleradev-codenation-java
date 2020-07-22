package com.algaworks.estoque.controller;

import com.algaworks.estoque.model.Produto;
import com.algaworks.estoque.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

    @Autowired
    private Produtos produtos;

    //Valor captirado da url GetMapping
    @GetMapping("/{id}")
    public Produto buscar(@PathVariable Long id){
        return produtos.findOne(id);
    }
}
