package br.com.curso.usuario;

import br.com.curso.alunos.ValidationException;

public class UsuarioAutorizavelAbstract extends Usuario {

  public UsuarioAutorizavelAbstract(String login, String cpf, String nome) throws ValidationException {
    super(login, cpf, nome);
    // TODO Auto-generated constructor stub
  }

  public boolean temAutorizacao(){
    return true;
  }

}