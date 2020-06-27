package br.com.curso;

public class MainProcedural {
    public static void main(String[] args) {
        String loginAluno = "meuLogin";
        if (validateLogin(loginAluno)){
            System.out.println("Login válido");
        }else {
            System.out.println("Login inválido");
        }
    }

    private  static  boolean validateLogin(String login){
        //verifica se o login nao é vazio, se o login nao é nulo e se é menor que 21
        return login != null && !login.isEmpty() && login.length() < 20;
    }
}
