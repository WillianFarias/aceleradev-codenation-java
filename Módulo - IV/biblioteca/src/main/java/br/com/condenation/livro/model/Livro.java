package br.com.condenation.livro.model;

import br.com.condenation.avaliacao.model.Avaliacao;
import br.com.condenation.categoria.model.Categoria;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.awt.*;
import java.util.List;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    private String titulo;

    @OneToMany
    private List<Avaliacao> avaliacoes;

    @ManyToMany
    private List<Categoria> categorias;

}
