package com.algaworks.estoque.controller;

//Tratando requisicoes webs com spring mvc e devolvendo arquivo json
//controlador

import com.algaworks.estoque.model.Produto;
import com.algaworks.estoque.repository.Produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

    @Autowired
    private Produtos produtos;

    //PathVariable é utilizado quando o valor da variável é passada diretamente na URL
    /*@GetMapping("/{id}")
    public Produto buscar(@PathVariable Long id){
        return produtos.findOne(id);
    }*/

    @GetMapping
    public List<Produto> pesquisar(){
        return produtos.findAll();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        return produtos.save(produto);
    }

    /*@DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        produtos.delete(id);
    }*/

    //Ordenacao de registros
    @GetMapping
    public List<Produto> pesquisar(
            @RequestParam(defaultValue = "nome") String ordenacao,
            @RequestParam(defaultValue = "ASC") Sort.Direction direcao) {
        return produtos.findAll(new Sort(direcao, ordenacao));
    }


}
