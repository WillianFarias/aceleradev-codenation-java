public class Aluno {

  private String nome;
  private Integer idade;
  private Integer altura;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public Integer getAltura() {
    return altura;
  }

  public void setAltura(Integer altura) {
    this.altura = altura;
  }

  public Aluno(String nome, Integer idade, Integer altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

}