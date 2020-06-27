package br.com.curso.alunos;

import br.com.curso.usuario.Usuario;

public class Aluno extends Usuario {

    private Integer matricula;

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
