package br.com.curso.alunos;

import br.com.curso.disciplinas.Disciplina;
import br.com.curso.usuario.Usuario;

import javax.persistence.*;
import java.util.List;

@Entity
public class Aluno extends Usuario {

    @Column(nullable = false, length = 14, unique = true)
    private Integer matricula;

    @ManyToMany
    @JoinTable(name = "disciplina_aluno", joinColumns =
            //o relacionamento é feito a partir do id da classe atual
            {@JoinColumn(name = "idAluno")}, inverseJoinColumns =
            //com o id da classe que será ligada
            {@JoinColumn(name = "idDisciplina")})
    private List<Disciplina> disciplinas;

    public Aluno(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }

    //Getter and Setter
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
