package br.com.curso.alunos;

public class Aluno {

    private String login;
    private String cpf;
    private String nome;

    public Aluno(String login, String cpf, String nome) {
        setLogin(login);
        setCpf(cpf);
        setNome(nome);
    }

    //Sobreescrevendo o metodo toString
    @Override
    public String toString() {
        return "Aluno{" +
                "login='" + login + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    private  static  boolean validateLogin(String login){
        //verifica se o login nao é vazio, se o login nao é nulo e se é menor que 21
        return login != null && !login.isEmpty() && login.length() < 20;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (validateLogin(login)){
            this.login = login;
        } else {
            System.out.println("Login inválido");
        }

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
