package br.com.curso.professor;

import br.com.curso.alunos.ValidationException;
import br.com.curso.usuario.Usuario;
import br.com.curso.usuario.UsuarioAutorizavel;

public class Professor extends Usuario implements UsuarioAutorizavel{

    public Professor(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }

    @Override
    public boolean temAutorizacao() {
        return true;
    }
}
