package br.com.curso.lancadornotas;

import br.com.curso.usuario.UsuarioAutorizavel;
import br.com.curso.usuario.UsuarioAutorizavelAbstract;

public class LancadorNotas {
  
  public void login(UsuarioAutorizavel usuarioAutorizavel){
    boolean temAutorizacao = usuarioAutorizavel.temAutorizacao();
    if (temAutorizacao) {
      System.out.println("Usuario tem autorização");
    }
  }

  public void login(UsuarioAutorizavelAbstract usuarioAutorizavel){
    boolean temAutorizacao = usuarioAutorizavel.temAutorizacao();
    if (temAutorizacao) {
      System.out.println("Usuario tem autorização");
    }
  }
}