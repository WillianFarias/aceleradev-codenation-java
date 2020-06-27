package br.com.curso.disciplinas;

import br.com.curso.alunos.Aluno;
import br.com.curso.professor.Professor;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private static final byte LIMITE = 10;
    private Professor professor;

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



}
