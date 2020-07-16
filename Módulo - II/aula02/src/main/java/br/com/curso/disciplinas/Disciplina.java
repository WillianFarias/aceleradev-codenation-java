package br.com.curso.disciplinas;

import br.com.curso.alunos.Aluno;
import br.com.curso.professor.Professor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Disciplina {

    private static final byte LIMITE = 10;
    @Id
    private Long id;
    private String nome;
    private String descricao;

    //relacionamento muito pra muitos
    @ManyToMany
    @JoinTable(name = "disciplina_aluno", joinColumns =
            {@JoinColumn(name = "idDisciplina")}, inverseJoinColumns =
            {@JoinColumn(name = "idAluno")})

    @ManyToOne
    @JoinColumn(name = "idProfessor")
    private Professor professor;

    private List<Aluno> alunos = new ArrayList<>();


    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    //Método responsável por matricular novos alunos, verifica se o total de alunos nao foi alcancado
    //antes de matricular um novo aluno
    public void matricular (Aluno aluno) throws LimiteAlunosAlcancadoException {
        if (this.alunos.size() < LIMITE){
            this.alunos.add(aluno);
        } else {
            throw new LimiteAlunosAlcancadoException("Limite máximo alcançado, o limite é: " + LIMITE);
        }
    }

    public void mostrarAlunos(){
        this.alunos.stream().forEach(aluno -> System.out.println(aluno.getNome()));
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }
}
