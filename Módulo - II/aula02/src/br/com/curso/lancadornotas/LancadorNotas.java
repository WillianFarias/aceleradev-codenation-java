package br.com.curso.lancadornotas;

import br.com.curso.usuario.UsuarioAutorizavel;

public class LancadorNotas {
  
  public void login(UsuarioAutorizavel usuarioAutorizavel){
    boolean temAutorizacao = usuarioAutorizavel.temAutorizacao();
    if (temAutorizacao) {
      System.out.println("Usuario tem autorização");
    }
  }
}