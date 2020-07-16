package br.com.condenation.leitor.model;

import br.com.condenation.avaliacao.model.Avaliacao;
import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Leitor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    @NotBlank
    private String nome;

    @OneToMany
    private List<Avaliacao> avaliacaos;
}
