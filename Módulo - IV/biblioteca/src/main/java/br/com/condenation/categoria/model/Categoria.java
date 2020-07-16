package br.com.condenation.categoria.model;

import br.com.condenation.livro.model.Livro;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    private String nome;

    @ManyToMany
    private List<Livro> livros;
}
