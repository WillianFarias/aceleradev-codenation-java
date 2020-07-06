package br.com.curso.professor;

import br.com.curso.alunos.ValidationException;
import br.com.curso.usuario.UsuarioAutorizavelAbstract;

public class Professor extends UsuarioAutorizavelAbstract{

    public Professor(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }

}
